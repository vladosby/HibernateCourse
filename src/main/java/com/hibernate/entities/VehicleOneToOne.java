package com.hibernate.entities;

import javax.persistence.*;

/**
 * Created by vlados on 8/7/2016.
 */

@Entity
public class VehicleOneToOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int VehicleId;

    private String name;

    public int getVehicleId() {
        return VehicleId;
    }

    public void setVehicleId(int vehicleId) {
        VehicleId = vehicleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "VehicleOneToOne{" +
                "VehicleId=" + VehicleId +
                ", name='" + name + '\'' +
                '}';
    }
}
