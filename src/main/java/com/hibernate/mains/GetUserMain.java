package com.hibernate.mains;

import com.hibernate.entities.User;
import com.hibernate.utils.DBConnection;

/**
 * Created by vlados on 8/7/2016.
 */
public class GetUserMain {
    public static void main(String[] args) {
        User user = DBConnection.getObjectById(User.class, 1);
        System.out.println(user);
        DBConnection.closeSessionFactory();

    }
}
