package com.hibernate.entities;

import javax.persistence.Entity;

/**
 * Created by vlados on 8/7/2016.
 */

@Entity
public class CarTPC extends VehicleTPC {
    private String fourWheels;

    public String getFourWheels() {
        return fourWheels;
    }

    public void setFourWheels(String fourWheels) {
        this.fourWheels = fourWheels;
    }

    @Override
    public String toString() {
        return "CarST{" +
                "fourWheels='" + fourWheels + '\'' +
                '}';
    }
}
