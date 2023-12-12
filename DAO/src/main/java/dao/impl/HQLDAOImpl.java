package dao.impl;

import dao.interf.IHQLDAO;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class HQLDAOImpl implements IHQLDAO {

    private static SessionFactory sessionFactory;

    private final static String HQL_punto1 =
                                                "SELECT a.destino, " +
                                                        "a.fecha_estimada_devolucion, " +
                                                        "v.patente, " +
                                                        "c.dni, " +
                                                        "FROM Alquiler a " +
                                                        "JOIN a.vehiculo v " +
                                                        "JOIN a.cliente c " +
                                                        "WHERE a.fecha_estimada_devolucion = :fecha " +
                                                        "AND WHERE a.destino.id_sucursal = :id_sucursal";

    private final static String HQL_punto2 =
                                                "SELECT c.nombre, " +
                                                        "v.patente, " +
                                                        "a.fecha_creacion, " +
                                                        "a.fecha_estimada_devolucion, " +
                                                        "a.fecha_devolucion, " +
                                                        "v.tipo " +
                                                        "FROM Alquiler a " +
                                                        "JOIN a.vehiculo v " +
                                                        "JOIN a.cliente c " +
                                                        "WHERE c.dni = :dni ";

    private final static String HQL_punto3 =
                                                "SELECT v.sucursal, " +
                                                        "v.tipo, " +
                                                        "v.patente, " +
                                                        "v.km_recorrido" +
                                                        "FROM Vehiculo v " +
                                                        "WHERE v.alquiler IS NULL";
    private static final String HQL_punto4 =
                                                "SELECT COUNT(v), " +
                                                "COUNT(v) " +
                                                "FROM Vehiculo v " +
                                                "JOIN v.sucursal s " +
                                                "WHERE s.id_sucursal = :id_sucursal";
    private static final String HQL_punto5 =
                                                "SELECT v.patente, " +
                                                        "v.tipo, " +
                                                        "s.id_sucursal, " +
                                                        "a.fecha_creacion, " +
                                                        "a.destino, " +
                                                        "a.fecha_devolucion, " +
                                                        "c.dni" +
                                                        "FROM Vehiculo v" +
                                                        "JOIN v.sucursal s " +
                                                        "JOIN v.alquiler a" +
                                                        "JOIN a.cliente c " +
                                                        "WHERE v.tipo = :tipo " +
                                                        "AND " +
                                                        "WHERE a.fecha_creacion " +
                                                        "BETWEEN :fechaInico" +
                                                        "AND " +
                                                        ":fechaFin";

    @Override
    public List<Object> punto1(Long id_sucursal, Date fecha_estimamda_devolucion) {
        List<Object> objectList = null;
        try {
            Session session = sessionFactory.openSession();

            Query query = session.createQuery(HQL_punto1);
            query.setParameter("id_sucursal", id_sucursal);
            query.setParameter("fecha", fecha_estimamda_devolucion);

            objectList = query.getResultList();

            session.close();
        } catch(HibernateException hibernateException) {
            objectList = new ArrayList<>();
        }
        return objectList;
    }

    @Override
    public List<Object> punto2(String cliente_dni) {
        List<Object> objectList = null;
        try {
            Session session = sessionFactory.openSession();

            Query query = session.createQuery(HQL_punto2);
            query.setParameter("dni", cliente_dni);

            objectList = query.getResultList();

            session.close();
        } catch(HibernateException hibernateException) {
            objectList = new ArrayList<>();
        }
        return objectList;
    }

    @Override
    public List<Object> punto3(Long id_sucursal) {
        List<Object> objectList = null;
        try {
            Session session = sessionFactory.openSession();

            Query query = session.createQuery(HQL_punto3);
            query.setParameter(0, id_sucursal);

            objectList = query.getResultList();

            session.close();
        } catch(HibernateException hibernateException) {
            objectList = new ArrayList<>();
        }
        return objectList;
    }

    @Override
    public List<Object> punto4(Long id_sucursal) {
        List<Object> objectList = null;
        try {
            Session session = sessionFactory.openSession();

            Query query = session.createQuery(HQL_punto4);
            query.setParameter("id_sucursal", id_sucursal);

            objectList = query.getResultList();

            session.close();
        } catch(HibernateException hibernateException) {
            objectList = new ArrayList<>();
        }
        return objectList;
    }

    @Override
    public List<Object> punto5(String vehiculo_tipo, Date fechaIncio, Date fechaFinal) {
        List<Object> objectList = null;
        try {
            Session session = sessionFactory.openSession();

            Query query = session.createQuery(HQL_punto5);
            query.setParameter("tipo", vehiculo_tipo);
            query.setParameter("fechaInicio", fechaIncio);
            query.setParameter("fechaFinal", fechaFinal);

            objectList = query.getResultList();

            session.close();
        } catch(HibernateException hibernateException) {
            objectList = new ArrayList<>();
        }
        return objectList;
    }
}
