package soapws.interf;

import struct.Sucursal;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(
        name = "HQLPORT"
)
public interface IHQLSOAP {

    @WebMethod(operationName = "punto1")
    public List<Object> punto1(@WebParam Long id_sucursal, @WebParam Date fecha_estimada_devolucion);

    @WebMethod(operationName = "punto2")
    public List<Object> punto2(@WebParam String cliente_dni);

    @WebMethod(operationName = "punto3")
    public List<Object> punto3(@WebParam Long id_sucursal);

    @WebMethod(operationName = "punto4")
    public List<Object> punto4(@WebParam Long id_sucursal);

    @WebMethod(operationName = "punto5")
    public List<Object> punto5(@WebParam String vehiculo_tipo, @WebParam Date fecha_incio, @WebParam Date fecha_final);
}
