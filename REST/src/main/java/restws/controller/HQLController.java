package restws.controller;

import soapws.impl.HQLPORT;
import soapws.impl.HQLSOAP;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.List;

@Path("/hql")
public class HQLController {

    private final HQLPORT hqlport;

    public HQLController() {
        this.hqlport = new HQLSOAP().getHQLSOAPImplPort();
    }

    @Path("/punto1")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response punto1(Long id_sucursal, Date fecha_estimamda_devolucion) {
        try {
            XMLGregorianCalendar fecha = DatatypeFactory.newInstance().newXMLGregorianCalendar(fecha_estimamda_devolucion.toString());

            List<Object> objectList = null;
            objectList = hqlport.punto1(id_sucursal, fecha);

            if(objectList != null) {
                return Response.status(Response.Status.FOUND)
                        .entity(objectList)
                        .build();
            }

        } catch(DatatypeConfigurationException datatypeConfigurationException) {
            return Response.status(Response.Status.EXPECTATION_FAILED)
                    .entity("DataTypeConfigurationException")
                    .build();
        }
        return Response.status(Response.Status.NOT_FOUND)
                .build();
    }

    @Path("/punto2")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response punto2(String cliente_dni) {
        List<Object> objectList = null;
        objectList = hqlport.punto2(cliente_dni);

        if(objectList != null) {
            return Response.status(Response.Status.FOUND)
                    .entity(objectList)
                    .build();
        }

        return Response.status(Response.Status.NOT_FOUND)
                .build();
    }

    @Path("/punto3")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response punto3(Long id_sucursal) {
        List<Object> objectList = null;
        objectList = hqlport.punto3(id_sucursal);

        if(objectList != null) {
            return Response.status(Response.Status.FOUND)
                    .entity(objectList)
                    .build();
        }

        return Response.status(Response.Status.NOT_FOUND)
                .build();
    }

    @Path("/punto4")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response punto4(Long id_sucursal) {
        List<Object> objectList = null;
        objectList = hqlport.punto4(id_sucursal);

        if(objectList != null) {
            return Response.status(Response.Status.FOUND)
                    .entity(objectList)
                    .build();
        }

        return Response.status(Response.Status.NOT_FOUND)
                .build();
    }

    @Path("/punto5")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response punto5() {
        List<Object> objectList = null;
        objectList = hqlport.punto5(1L);

        if(objectList != null) {
            return Response.status(Response.Status.FOUND)
                    .entity(objectList)
                    .build();
        }

        return Response.status(Response.Status.NOT_FOUND)
                .build();
    }

}
