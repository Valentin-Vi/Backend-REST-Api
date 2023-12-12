package soapws.interf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import struct.Cliente;

import java.util.List;

@WebService(
        name = "ClientePORT"
)
public interface IClienteSOAP {
    @WebMethod(operationName = "createCliente")
    public Integer createCliente(@WebParam Cliente cliente);

    @WebMethod(operationName = "readClienteById")
    public Cliente readClienteById(@WebParam Long id_cliente);

    @WebMethod(operationName = "readAllCliente")
    public List<Cliente> readAllCliente();

    @WebMethod(operationName = "updateCliente")
    public Integer updateCliente(@WebParam Cliente cliente);

    @WebMethod(operationName = "deleteCliente")
    public Integer deleteCliente(@WebParam Cliente cliente);
}
