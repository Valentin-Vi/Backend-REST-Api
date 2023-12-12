package dao.interf;

import struct.Cliente;

import java.util.List;

public interface IClienteDAO {
    public Integer createCliente(Cliente cliente);
    public Cliente readClienteById(Long id_cliente);
    public List<Cliente> readAllCliente();
    public Integer updateCliente(Cliente cliente);
    public Integer deleteCliente(Cliente cliente);
}
