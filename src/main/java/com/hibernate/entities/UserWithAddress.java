package com.hibernate.entities;

import javax.persistence.*;

/**
 * Created by vlados on 8/7/2016.
 */

@Entity
@Table(name = "USERS_DATA")
public class UserWithAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "STREET_NAME"))
    })
    private AddressEmbedded address;

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

    public AddressEmbedded getAddress() {
        return address;
    }

    public void setAddress(AddressEmbedded address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserWithAddress{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
