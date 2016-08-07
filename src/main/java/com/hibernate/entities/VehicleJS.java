package com.hibernate.entities;

import javax.persistence.*;

/**
 * Created by vlados on 8/7/2016.
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class VehicleJS {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
