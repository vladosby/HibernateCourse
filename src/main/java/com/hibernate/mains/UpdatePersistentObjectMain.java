package com.hibernate.mains;

import com.hibernate.entities.User;
import com.hibernate.utils.DBConnection;
import org.hibernate.Session;

import java.util.Date;

/**
 * Created by vlados on 8/7/2016.
 */
public class UpdatePersistentObjectMain {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Name1");
        user.setSurname("Surname1");
        user.setDate(new Date());
        user.setDescription("I am very big text.");

        try(Session session = DBConnection.getSession()) {
            session.beginTransaction();

            session.save(user);

            //update will happen only once
            user.setName("Updated Name");
            user.setName("Updated Name Again");

            session.getTransaction().commit();
            session.close();
        } finally {
            DBConnection.closeSessionFactory();
        }
    }
}
