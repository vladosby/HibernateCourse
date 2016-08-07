package com.hibernate.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by vlados on 8/7/2016.
 */

@Entity
public class UserOneToMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
//    @JoinTable(joinColumns = @JoinColumn(name="USER_ID"),
//        inverseJoinColumns = @JoinColumn(name = "VEHICLE_ID"),
//            name = "USER_VEHICLE"
//    )
    private Collection<VehicleManyToOne> vehicles = new ArrayList<>();

    public Collection<VehicleManyToOne> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Collection<VehicleManyToOne> vehicles) {
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
        return "UserOneToMany{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vehicles=" + vehicles.size() +
                '}';
    }
}
