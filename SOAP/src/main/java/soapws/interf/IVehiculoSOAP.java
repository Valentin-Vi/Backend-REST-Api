package soapws.interf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import struct.Vehiculo;

import java.util.List;

@WebService(
        name = "VehiculoPORT"
)
public interface IVehiculoSOAP {
    @WebMethod(operationName = "createVehiculo")
    public Integer createVehiculo(@WebParam Vehiculo vehiculo);

    @WebMethod(operationName = "readVehiculoById")
    public Vehiculo readVehiculoById(@WebParam Long id_vehiculo);

    @WebMethod(operationName = "readAllVehiculo")
    public List<Vehiculo> readAllVehiculo();

    @WebMethod(operationName = "updateVehiculo")
    public Integer updateVehiculo(@WebParam Vehiculo vehiculo);

    @WebMethod(operationName = "deleteVehiculo")
    public Integer deleteVehiculo(@WebParam Vehiculo vehiculo);
}
