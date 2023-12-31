package util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import struct.*;

import java.util.Properties;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public synchronized static SessionFactory getSessionFactory() {
        if(sessionFactory==null) {
            Configuration configuration = buildConfiguration();

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties())
                    .build();

            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }

    private synchronized static Configuration buildConfiguration() {
        Configuration configuration = new Configuration();
        Properties properties = new Properties();

        properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        properties.put(Environment.URL, "jdbc:mysql://localhost:3306/db");
        properties.put(Environment.USER, "root");
        properties.put(Environment.PASS, "password");
        properties.put(Environment.SHOW_SQL, "true");
        properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
        properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        properties.put(Environment.HBM2DDL_AUTO, "update");

        configuration.setProperties(properties);
        configuration.configure("hibernate.cfg.xml");

        configuration.addAnnotatedClass(Alquiler.class);
        configuration.addAnnotatedClass(Cliente.class);
        configuration.addAnnotatedClass(Sucursal.class);
        configuration.addAnnotatedClass(Vehiculo.class);
        configuration.addAnnotatedClass(Camioneta.class);
        configuration.addAnnotatedClass(Auto.class);

        return configuration;
    }
}
