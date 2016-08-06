package com.hibernate.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by vlados on 8/6/2016.
 */
public class DBConnection {
    private static final SessionFactory sessionFactory;

    static {
        sessionFactory = new Configuration().configure("com.hibernate.configuration/hibernate.cfg.xml").buildSessionFactory();
    }

    private DBConnection() {
    }

    public static Session getSession() {
        return sessionFactory.openSession();
    }

    public static void saveObject(Object object) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(object);
            session.getTransaction().commit();
        }
    }

    public static void closeSessionFactory() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }
}
