package com.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

/**
 * Created by vlados on 8/7/2016.
 */

@Embeddable
public class AddressEmbedded {
    private String street;
    @Column(name = "BUILD_NUMBER")
    private String building;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    @Override
    public String toString() {
        return "AddressEmbedded{" +
                "street='" + street + '\'' +
                ", building='" + building + '\'' +
                '}';
    }
}
