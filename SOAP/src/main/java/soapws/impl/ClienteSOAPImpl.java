package soapws.impl;

import dao.factory.ClienteDAOFactory;
import dao.factory.FactoryTypeEnum;
import dao.interf.IClienteDAO;
import exception.DAOTypeException;
import javax.jws.WebService;
import soapws.interf.IClienteSOAP;
import struct.Cliente;

import java.util.List;

@WebService(endpointInterface = "soapws.interf.IClienteSOAP", serviceName = "ClienteSOAP")
public class ClienteSOAPImpl implements IClienteSOAP {

    private IClienteDAO clienteDAO;

    public ClienteSOAPImpl() {
        try {
            this.clienteDAO = ClienteDAOFactory.getImpl(FactoryTypeEnum.HIBERNATE);
        } catch(DAOTypeException daoTypeException) {
            System.exit(1);
        }
    }

    @Override
    public Integer createCliente(Cliente cliente) {
        return clienteDAO.createCliente(cliente);
    }

    @Override
    public Cliente readClienteById(Long id_cliente) {
        return clienteDAO.readClienteById(id_cliente);
    }

    @Override
    public List<Cliente> readAllCliente() {
        return clienteDAO.readAllCliente();
    }

    @Override
    public Integer updateCliente(Cliente cliente) {
        return clienteDAO.updateCliente(cliente);
    }

    @Override
    public Integer deleteCliente(Cliente cliente) {
        return clienteDAO.deleteCliente(cliente);
    }
}
