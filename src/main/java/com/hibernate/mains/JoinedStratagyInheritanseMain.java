package com.hibernate.mains;

import com.hibernate.entities.*;
import com.hibernate.utils.DBConnection;

/**
 * Created by vlados on 8/7/2016.
 */
public class JoinedStratagyInheritanseMain {
    public static void main(String[] args) {
        VehicleJS vehicle = new VehicleJS();
        vehicle.setName("Vehicle");

        CarJS car = new CarJS();
        car.setName("Car");
        car.setFourWheels("4");

        BikeJS bike = new BikeJS();
        bike.setName("Bike");
        bike.setTwoWheels("2");

        DBConnection.saveObject(vehicle);
        DBConnection.saveObject(car);
        DBConnection.saveObject(bike);
        DBConnection.closeSessionFactory();
    }
}
