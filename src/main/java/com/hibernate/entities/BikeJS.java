package com.hibernate.entities;

import javax.persistence.Entity;

/**
 * Created by vlados on 8/7/2016.
 */

@Entity
public class BikeJS extends VehicleJS {
    private String twoWheels;

    public String getTwoWheels() {
        return twoWheels;
    }

    public void setTwoWheels(String twoWheels) {
        this.twoWheels = twoWheels;
    }

    @Override
    public String toString() {
        return "BikeST{" +
                "twoWheels='" + twoWheels + '\'' +
                '}';
    }
}
