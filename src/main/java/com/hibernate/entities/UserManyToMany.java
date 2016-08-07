package com.hibernate.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by vlados on 8/7/2016.
 */

@Entity
public class UserManyToMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(joinColumns = @JoinColumn(name="USER_ID"),
        inverseJoinColumns = @JoinColumn(name = "VEHICLE_ID"),
            name = "USER_VEHICLE"
    )
    private Collection<VehicleManyToMany> vehicles = new ArrayList<>();

    public Collection<VehicleManyToMany> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Collection<VehicleManyToMany> vehicles) {
        this.vehicles = vehicles;
    }

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

    @Override
    public String toString() {
        String vehicleInfo ="id = ";
        for(VehicleManyToMany vehicle: vehicles) {
            vehicleInfo += vehicle.getVehicleId() + ",id = ";
        }

        return "UserOneToMany{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vehicles=" + vehicleInfo +
                '}';
    }
}
