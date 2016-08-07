package com.hibernate.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by vlados on 8/7/2016.
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "VEHICLE_TYPE",
discriminatorType = DiscriminatorType.STRING)
public class VehicleST {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

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
        return "VehicleST{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
