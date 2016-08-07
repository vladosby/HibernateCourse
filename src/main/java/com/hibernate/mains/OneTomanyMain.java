package com.hibernate.mains;

import com.hibernate.entities.UserOneToMany;
import com.hibernate.entities.UserOneToOne;
import com.hibernate.entities.VehicleManyToOne;
import com.hibernate.entities.VehicleOneToOne;
import com.hibernate.utils.DBConnection;
import org.hibernate.Session;

/**
 * Created by vlados on 8/7/2016.
 */
public class OneToManyMain {
    public static void main(String[] args) {
        VehicleManyToOne vehicle1 = new VehicleManyToOne();
        vehicle1.setName("Car 1");

        VehicleManyToOne vehicle2 = new VehicleManyToOne();
        vehicle2.setName("Car 2");

        UserOneToMany user = new UserOneToMany();
        user.setName("Owner of car 1 and 2");
//        user.getVehicles().add(vehicle1);
//        user.getVehicles().add(vehicle2);
        vehicle1.setUser(user);
        vehicle2.setUser(user);

        try (Session session = DBConnection.getSession()) {
            session.beginTransaction();
            session.save(user);
            session.save(vehicle1);
            session.save(vehicle2);
            session.getTransaction().commit();
        }

        UserOneToMany user2 = DBConnection.getObjectById(UserOneToMany.class, 1);
        System.out.println(user2);

        VehicleManyToOne vehicle = DBConnection.getObjectById(VehicleManyToOne.class, 1);
        System.out.println(vehicle);

        DBConnection.closeSessionFactory();

    }
}
