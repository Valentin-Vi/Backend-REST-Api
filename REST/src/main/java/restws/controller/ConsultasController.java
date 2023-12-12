package restws.controller;

import soapws.impl.VehiculoPORT;
import soapws.impl.VehiculoSOAP;
import soapws.interf.Vehiculo;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/consultas")
public class ConsultasController {
    private VehiculoPORT vehiculoPORT;

    public ConsultasController() {
        this.vehiculoPORT = new VehiculoSOAP().getVehiculoSOAPImplPort();
    }

    @GET
    @Path("/vehiculo")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response consultarVehiculo(Long id_vehiculo) {

        if(id_vehiculo != null) {

            Vehiculo vehiculo = vehiculoPORT.readVehiculoById(id_vehiculo);

            if(vehiculo.getAlquiler() == null) {
                return Response.status(Response.Status.FOUND)
                        .entity("DISPONIBLE")
                        .build();
            } else {
                return Response.status(Response.Status.FOUND)
                        .entity("NO_DISPONIBLE")
                        .build();
            }

        }


        return Response.status(Response.Status.NOT_ACCEPTABLE)
                .entity(id_vehiculo)
                .build();
    }
}
