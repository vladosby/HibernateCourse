package com.hibernate.mains;

import com.hibernate.entities.BikeST;
import com.hibernate.entities.CarST;
import com.hibernate.entities.VehicleST;
import com.hibernate.utils.DBConnection;

/**
 * Created by vlados on 8/7/2016.
 */
public class SingleTableInheritanseMain {
    public static void main(String[] args) {
        VehicleST vehicleST = new VehicleST();
        vehicleST.setName("Vehicle");

        CarST carST = new CarST();
        carST.setName("Car");
        carST.setFourWheels("4");

        BikeST bikeST = new BikeST();
        bikeST.setName("Bike");
        bikeST.setTwoWheels("2");

        DBConnection.saveObject(vehicleST);
        DBConnection.saveObject(carST);
        DBConnection.saveObject(bikeST);
        DBConnection.closeSessionFactory();
    }
}
