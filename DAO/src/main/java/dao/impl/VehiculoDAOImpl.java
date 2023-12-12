package dao.impl;

import dao.interf.IVehiculoDAO;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import struct.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class VehiculoDAOImpl implements IVehiculoDAO {

    private static SessionFactory sessionFactory;

    private static final String HQL_readAll = "SELECT v Vehiculo v";



    @Override
    public Integer createVehiculo(Vehiculo vehiculo) {
        Transaction transaction = null;
        try {
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(vehiculo);
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
    public Vehiculo readVehiculoById(Long id_vehiculo) {
        Vehiculo vehiculo = null;
        try {
            Session session = sessionFactory.openSession();
            vehiculo = session.get(Vehiculo.class, id_vehiculo);
            session.close();
        } catch(HibernateException hibernateException) {
            vehiculo = new Vehiculo();
        }
        return vehiculo;
    }

    @Override
    public List<Vehiculo> readAllVehiculo() {
        List<Vehiculo> vehiculoList = null;
        try {
            Session session = sessionFactory.openSession();
            vehiculoList = session.createQuery(HQL_readAll).getResultList();
            session.close();
        } catch(HibernateException hibernateException) {
            vehiculoList = new ArrayList<>();
        }
        return vehiculoList;
    }

    @Override
    public Integer updateVehiculo(Vehiculo vehiculo) {
        Transaction transaction = null;
        try {
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.update(vehiculo);
            transaction.commit();
            session.close();
            return 0;
        } catch(HibernateException hibernateException) {
            return 1;
        }
    }

    @Override
    public Integer deleteVehiculo(Vehiculo vehiculo) {
        Transaction transaction = null;
        try {
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.delete(vehiculo);
            transaction.commit();
            session.close();
            return 0;
        } catch(HibernateException hibernateException) {
            return 1;
        }
    }
}
