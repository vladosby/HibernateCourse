package com.hibernate.mains;

import com.hibernate.entities.UserManyToMany;
import com.hibernate.entities.UserOneToMany;
import com.hibernate.entities.VehicleManyToMany;
import com.hibernate.entities.VehicleManyToOne;
import com.hibernate.utils.DBConnection;
import org.hibernate.Session;

/**
 * Created by vlados on 8/7/2016.
 */
public class ManyToManyMain {
    public static void main(String[] args) {
        VehicleManyToMany vehicle1 = new VehicleManyToMany();
        vehicle1.setName("Car 1");

        VehicleManyToMany vehicle2 = new VehicleManyToMany();
        vehicle2.setName("Car 2");

        UserManyToMany user1 = new UserManyToMany();
        user1.setName("Owner of car 2");
        UserManyToMany user2 = new UserManyToMany();
        user1.setName("Owner of car 1");
        user2.getVehicles().add(vehicle1);
        user1.getVehicles().add(vehicle2);

        try (Session session = DBConnection.getSession()) {
            session.beginTransaction();
            session.persist(user1);
            session.persist(user2);
            session.getTransaction().commit();
        }

        UserManyToMany user = DBConnection.getObjectById(UserManyToMany.class, 1);
        System.out.println(user);

        VehicleManyToMany vehicle = DBConnection.getObjectById(VehicleManyToMany.class, 2);
        System.out.println(vehicle);

        DBConnection.closeSessionFactory();

    }
}
