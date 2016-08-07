package com.hibernate.mains;

import com.hibernate.entities.UserOneToOne;
import com.hibernate.entities.VehicleOneToOne;
import com.hibernate.utils.DBConnection;
import org.hibernate.Session;

/**
 * Created by vlados on 8/7/2016.
 */
public class OneToOneMain {
    public static void main(String[] args) {
        VehicleOneToOne vehicle = new VehicleOneToOne();
        vehicle.setName("Car");

        UserOneToOne user = new UserOneToOne();
        user.setName("Owner of car");
        user.setVehicle(vehicle);

        try (Session session = DBConnection.getSession()) {
            session.beginTransaction();
            session.save(user);
            session.save(vehicle);
            session.getTransaction().commit();
        }

        UserOneToOne user2 = DBConnection.getObjectById(UserOneToOne.class, 1);
        System.out.println(user2);

        DBConnection.closeSessionFactory();

    }
}
