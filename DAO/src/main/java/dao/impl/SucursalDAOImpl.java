package dao.impl;

import dao.interf.ISucursalDAO;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import struct.Sucursal;

import java.util.ArrayList;
import java.util.List;

public class SucursalDAOImpl implements ISucursalDAO {

    private static SessionFactory sessionFactory;

    private static final String HQL_readAll = "SELECT s Sucursal s";



    @Override
    public Integer createSucursal(Sucursal sucursal) {
        Transaction transaction = null;
        try {
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(sucursal);
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
    public Sucursal readSucursalById(Long id_sucursal) {
        Sucursal sucursal = null;
        try {
            Session session = sessionFactory.openSession();
            sucursal = session.get(Sucursal.class, id_sucursal);
            session.close();
        } catch(HibernateException hibernateException) {
            sucursal = new Sucursal();
        }
        return sucursal;
    }

    @Override
    public List<Sucursal> readAllSucursal() {
        List<Sucursal> sucursalList = null;
        try {
            Session session = sessionFactory.openSession();
            sucursalList = session.createQuery(HQL_readAll).getResultList();
            session.close();
        } catch(HibernateException hibernateException) {
            sucursalList = new ArrayList<>();
        }
        return sucursalList;
    }

    @Override
    public Integer updateSucursal(Sucursal sucursal) {
        Transaction transaction = null;
        try {
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.update(sucursal);
            transaction.commit();
            session.close();
            return 0;
        } catch(HibernateException hibernateException) {
            return 1;
        }
    }

    @Override
    public Integer deleteSucursal(Sucursal sucursal) {
        Transaction transaction = null;
        try {
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.delete(sucursal);
            transaction.commit();
            session.close();
            return 0;
        } catch(HibernateException hibernateException) {
            return 1;
        }
    }
}
