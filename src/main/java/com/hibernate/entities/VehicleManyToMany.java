package com.hibernate.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by vlados on 8/7/2016.
 */

@Entity
public class VehicleManyToMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int VehicleId;

    private String name;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "vehicles")
//    @JoinColumn(name = "USER_ID")
    private Collection<UserManyToMany> users = new ArrayList<>();

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

    public Collection<UserManyToMany> getUsers() {
        return users;
    }

    public void setUsers(Collection<UserManyToMany> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        String userInfo = "id = ";
        for(UserManyToMany user: users) {
            userInfo += user.getId() + ",id = ";
        }

        return "VehicleManyToOne{" +
                "VehicleId=" + VehicleId +
                ", name='" + name + '\'' +
                ", user=" + userInfo +
                '}';
    }
}
