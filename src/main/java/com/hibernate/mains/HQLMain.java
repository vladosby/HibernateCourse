package com.hibernate.mains;

import com.hibernate.entities.User;
import com.hibernate.utils.DBConnection;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Map;

/**
 * Created by vlados on 8/7/2016.
 */
public class HQLMain {
    public static void main(String[] args) {
        try (Session session = DBConnection.getSession()) {
            session.beginTransaction();

            String surname = "Surname1";
            Query query = session.createQuery("from user_entity where surname = ?");
            query.setParameter(0, surname);

            List<User> users = (List<User>) query.list();
            users.forEach(System.out::println);
            System.out.println();

            Query query2 = session.createQuery("select name from user_entity");
            List<String> names = (List<String>) query2.list();
            names.forEach(System.out::println);
            System.out.println();

            Query query3 = session.createQuery("from user_entity where surname = :surname");
            query3.setParameter("surname", surname);
            query.setFirstResult(2);
            query.setMaxResults(1);

            List<User> users2 = (List<User>) query.list();
            users2.forEach(System.out::println);

            session.getTransaction().commit();
            session.close();
        } finally {
            DBConnection.closeSessionFactory();
        }
    }
}
