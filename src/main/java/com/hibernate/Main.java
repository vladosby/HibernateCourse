package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by vlados on 8/5/2016.
 */
public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("com.hibernate.configuration/hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.close();
        sessionFactory.close();
    }
}
