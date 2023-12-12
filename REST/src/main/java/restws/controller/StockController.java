package restws.controller;

import soapws.impl.VehiculoPORT;
import soapws.impl.VehiculoSOAP;
import soapws.interf.Vehiculo;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/stock")
public class StockController {

    private VehiculoPORT vehiculoPORT;

    public StockController() {
        this.vehiculoPORT = new VehiculoSOAP().getVehiculoSOAPImplPort();
    }

    @POST
    @Path("/actualizar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateStockVehiculo(Long id_vehiculo, Integer stock) {

        if(id_vehiculo != null && stock != null) {
            Vehiculo vehiculo = vehiculoPORT.readVehiculoById(id_vehiculo);
            if(vehiculo.getIdVehiculo() != null) {
                vehiculo.setStock(stock);
                vehiculoPORT.updateVehiculo(vehiculo);
                return Response.status(Response.Status.ACCEPTED)
                        .entity(id_vehiculo)
                        .build();
            }
        }

        return Response.status(Response.Status.NOT_ACCEPTABLE)
                .entity(id_vehiculo)
                .build();
    }
}
