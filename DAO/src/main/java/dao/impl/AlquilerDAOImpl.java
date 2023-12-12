package dao.impl;

import dao.interf.IAlquilerDAO;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import struct.Alquiler;

import java.util.ArrayList;
import java.util.List;

public class AlquilerDAOImpl implements IAlquilerDAO {

    private static SessionFactory sessionFactory;

    private static final String HQL_readAll = "SELECT a Alquiler a";



    @Override
    public Integer createAlquiler(Alquiler alquiler) {
        Transaction transaction = null;
        try {
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(alquiler);
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
    public Alquiler readAlquilerById(Long id_alquiler) {
        Alquiler alquiler = null;
        try {
            Session session = sessionFactory.openSession();
            alquiler = session.get(Alquiler.class, id_alquiler);
            session.close();
        } catch(HibernateException hibernateException) {
            alquiler = new Alquiler();
        }
        return alquiler;
    }

    @Override
    public List<Alquiler> readAllAlquiler() {
        List<Alquiler> alquilerList = null;
        try {
            Session session = sessionFactory.openSession();
            alquilerList = session.createQuery(HQL_readAll).getResultList();
            session.close();
        } catch(HibernateException hibernateException) {
            alquilerList = new ArrayList<>();
        }
        return alquilerList;
    }

    @Override
    public Integer updateAlquiler(Alquiler alquiler) {
        Transaction transaction = null;
        try {
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.update(alquiler);
            transaction.commit();
            session.close();
            return 0;
        } catch(HibernateException hibernateException) {
            return 1;
        }
    }

    @Override
    public Integer deleteAlquiler(Alquiler alquiler) {
        Transaction transaction = null;
        try {
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.delete(alquiler);
            transaction.commit();
            session.close();
            return 0;
        } catch(HibernateException hibernateException) {
            return 1;
        }
    }
}
