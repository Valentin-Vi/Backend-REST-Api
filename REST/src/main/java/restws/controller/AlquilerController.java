package restws.controller;

import soapws.impl.*;
import soapws.interf.Alquiler;
import soapws.interf.Vehiculo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.*;

@Path("/alquilar")
public class AlquilerController {

    private final AlquilerPORT alquilerPORT;
    private final ClientePORT clientePORT;
    private final VehiculoPORT vehiculoPORT;
    private final SucursalPORT sucursalPORT;

    public AlquilerController() {
        this.alquilerPORT = new AlquilerSOAP().getAlquilerSOAPImplPort();
        this.clientePORT = new ClienteSOAP().getClienteSOAPImplPort();
        this.vehiculoPORT = new VehiculoSOAP().getVehiculoSOAPImplPort();
        this.sucursalPORT = new SucursalSOAP().getSucursalSOAPImplPort();
    }

    @Path("/create")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createAlquiler(Long id_cliente, Long id_vehiculo, Long id_origen, Long id_destino ) {

        if (id_cliente != null || id_vehiculo != null || id_origen != null || id_destino != null) {
            Alquiler alquiler = new Alquiler();

            alquiler.setCliente(clientePORT.readClienteById(id_cliente));
            alquiler.setOrigen(sucursalPORT.readSucursalById(id_origen));
            alquiler.setDestino(sucursalPORT.readSucursalById(id_destino));
            Vehiculo vehiculo = vehiculoPORT.readVehiculoById(id_vehiculo);
            vehiculo.setStock(vehiculo.getStock() - 1);
            alquiler.setVehiculo(vehiculo);

            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(
                    new Date(System.currentTimeMillis())
            );

            try {
                XMLGregorianCalendar xmlcalendar = DatatypeFactory
                        .newInstance()
                        .newXMLGregorianCalendar(gregorianCalendar);
                alquiler.setFechaCreacion(xmlcalendar);

                gregorianCalendar.add(GregorianCalendar.MONTH, 1);
                xmlcalendar = DatatypeFactory
                        .newInstance()
                        .newXMLGregorianCalendar(gregorianCalendar);
                alquiler.setFechaEstimadaDevolucion(xmlcalendar);
            } catch (DatatypeConfigurationException datatypeConfigurationException) {
                return Response.status(Response.Status.CONFLICT)
                        .entity(gregorianCalendar)
                        .build();
            }

            if (alquilerPORT.createAlquiler(alquiler) == 0) {
                return Response.status(Response.Status.CREATED)
                        .entity(alquiler)
                        .build();
            }
        }

        return Response.status(Response.Status.NOT_ACCEPTABLE)
                .build();
    }

    @GET
    @Path("/search")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response readAlquilerById(Long id_alquiler) {
        if (id_alquiler == null) {
            return Response.status(Response.Status.NOT_ACCEPTABLE)
                    .entity(id_alquiler)
                    .build();
        }

        Alquiler alquiler = alquilerPORT.readAlquilerById(id_alquiler);

        return Response.status(Response.Status.FOUND)
                .entity(alquiler)
                .build();
    }

    @GET
    @Path("/getAll")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response readAllAlquiler() {
        return Response.status(Response.Status.OK)
                .entity(alquilerPORT.readAllAlquiler())
                .build();
    }

    @POST
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAlquiler(Alquiler alquiler) {
        if (alquiler == null || alquiler.getIdAlquiler() == null) {
            if(alquilerPORT.updateAlquiler(alquiler) == 0) {
                return Response.status(Response.Status.ACCEPTED)
                        .entity(alquiler)
                        .build();
            }
        }

        return Response.status(Response.Status.NOT_ACCEPTABLE)
                .entity(alquiler)
                .build();
    }

    @POST
    @Path("/delete")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response deletAlquiler(Long id_alquiler) {
        if(id_alquiler != null) {
            if(alquilerPORT.deleteAlquiler(alquilerPORT.readAlquilerById(id_alquiler)) == 0) {
                return Response.status(Response.Status.ACCEPTED)
                        .entity(id_alquiler)
                        .build();
            }
        }

        return Response.status(Response.Status.EXPECTATION_FAILED)
                .build();
    }




}
