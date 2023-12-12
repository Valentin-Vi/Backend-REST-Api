package soapws.interf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import struct.Alquiler;

import java.util.List;

@WebService(
        name = "AlquilerPORT"
)
public interface IAlquilerSOAP {
    @WebMethod(operationName = "createAlquiler")
    public Integer createAlquiler(@WebParam Alquiler alquiler);

    @WebMethod(operationName = "readAlquilerById")
    public Alquiler readAlquilerById(@WebParam Long id_alquiler);

    @WebMethod(operationName = "readAllAlquiler")
    public List<Alquiler> readAllAlquiler();

    @WebMethod(operationName = "updateAlquiler")
    public Integer updateAlquiler(@WebParam Alquiler alquiler);

    @WebMethod(operationName = "deleteAlquiler")
    public Integer deleteAlquiler(@WebParam Alquiler alquiler);
}
