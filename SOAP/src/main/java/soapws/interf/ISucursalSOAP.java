package soapws.interf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import struct.Sucursal;

import java.util.List;

@WebService(
        name = "SucursalPORT"
)
public interface ISucursalSOAP {
    @WebMethod(operationName = "createSucursal")
    public Integer createSucursal(@WebParam Sucursal sucursal);

    @WebMethod(operationName = "readSucursalById")
    public Sucursal readSucursalById(@WebParam Long id_sucursal);

    @WebMethod(operationName = "readAllSucursal")
    public List<Sucursal> readAllSucursal();

    @WebMethod(operationName = "updateSucursal")
    public Integer updateSucursal(@WebParam Sucursal sucursal);

    @WebMethod(operationName = "deleteSucursal")
    public Integer deleteSucursal(@WebParam Sucursal sucursal);
}
