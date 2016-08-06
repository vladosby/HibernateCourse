package com.hibernate.mains;

import com.hibernate.entities.User;
import com.hibernate.utils.DBConnection;

/**
 * Created by vlados on 8/6/2016.
 */
public class SaveUserMain {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("Name1");
        user.setSurname("Surname1");

        DBConnection.saveObject(user);
        DBConnection.closeSessionFactory();
    }
}
