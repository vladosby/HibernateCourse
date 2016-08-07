package com.hibernate.mains;

import com.hibernate.entities.*;
import com.hibernate.utils.DBConnection;

/**
 * Created by vlados on 8/7/2016.
 */
public class TablePerClassInheritanseMain {
    public static void main(String[] args) {
        VehicleTPC vehicle = new VehicleTPC();
        vehicle.setName("Vehicle");

        CarTPC car = new CarTPC();
        car.setName("Car");
        car.setFourWheels("4");

        BikeTPC bike = new BikeTPC();
        bike.setName("Bike");
        bike.setTwoWheels("2");

        DBConnection.saveObject(vehicle);
        DBConnection.saveObject(car);
        DBConnection.saveObject(bike);
        DBConnection.closeSessionFactory();
    }
}
