package dao.impl;

import dao.interf.IClienteDAO;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import struct.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements IClienteDAO {

    private static SessionFactory sessionFactory;

    private static final String HQL_readAll = "SELECT c Cliente c";



    @Override
    public Integer createCliente(Cliente cliente) {
        Transaction transaction = null;
        try {
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(cliente);
            transaction.commit();
            session.close();
        } catch(HibernateException hibernateException) {
            if(transaction == null && transaction.isActive()) {
                transaction.rollback();
                return 1;
            }
        }
        return 0;
    }

    @Override
    public Cliente readClienteById(Long id_cliente) {
        Cliente cliente = null;
        try {
            Session session = sessionFactory.openSession();
            cliente = session.get(Cliente.class, id_cliente);
            session.close();
        } catch(HibernateException hibernateException) {
            cliente = new Cliente();
        }
        return cliente;
    }

    @Override
    public List<Cliente> readAllCliente() {
        List<Cliente> clienteList = null;
        try {
            Session session = sessionFactory.openSession();
            clienteList = session.createQuery(HQL_readAll).getResultList();
            session.close();
        } catch(HibernateException hibernateException) {
            clienteList = new ArrayList<>();
        }
        return clienteList;
    }

    @Override
    public Integer updateCliente(Cliente cliente) {
        Transaction transaction = null;
        try {
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.update(cliente);
            transaction.commit();
            session.close();
            return 0;
        } catch(HibernateException hibernateException) {
            return 1;
        }
    }

    @Override
    public Integer deleteCliente(Cliente cliente) {
        Transaction transaction = null;
        try {
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.delete(cliente);
            transaction.commit();
            session.close();
            return 0;
        } catch(HibernateException hibernateException) {
            return 1;
        }
    }
}
