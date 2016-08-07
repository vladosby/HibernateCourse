package com.hibernate.entities;

import javax.persistence.*;

/**
 * Created by vlados on 8/7/2016.
 */

@Entity
public class VehicleManyToOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int VehicleId;

    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_ID")
    private UserOneToMany user;

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

    public UserOneToMany getUser() {
        return user;
    }

    public void setUser(UserOneToMany user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "VehicleManyToOne{" +
                "VehicleId=" + VehicleId +
                ", name='" + name + '\'' +
                ", user=" + user +
                '}';
    }
}
