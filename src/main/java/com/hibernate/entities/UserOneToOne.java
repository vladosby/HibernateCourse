package com.hibernate.entities;

import javax.persistence.*;

/**
 * Created by vlados on 8/7/2016.
 */

@Entity
public class UserOneToOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToOne
    @JoinColumn(name = "VEHICLE_ID")
    private VehicleOneToOne vehicle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleOneToOne getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleOneToOne vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "UserOneToOne{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }
}
