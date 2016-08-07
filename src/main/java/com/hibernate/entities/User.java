package com.hibernate.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by vlados on 8/5/2016.
 */

@Entity(name = "user_entity")
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @Column(name = "SECOND_NAME")
    private String surname;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Lob
    private String description;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date=" + date +
                ", description='" + description + '\'' +
                '}';
    }
}
