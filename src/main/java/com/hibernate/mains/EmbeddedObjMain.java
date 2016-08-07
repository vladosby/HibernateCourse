package com.hibernate.mains;

import com.hibernate.entities.AddressEmbedded;
import com.hibernate.entities.User;
import com.hibernate.entities.UserWithAddress;
import com.hibernate.utils.DBConnection;

/**
 * Created by vlados on 8/7/2016.
 */
public class EmbeddedObjMain {
    public static void main(String[] args) {
        AddressEmbedded address = new AddressEmbedded();
        address.setBuilding("14/2");
        address.setStreet("Street 1");

        UserWithAddress user = new UserWithAddress();
        user.setName("User1");
        user.setAddress(address);
        DBConnection.saveObject(user);

        UserWithAddress user2 = DBConnection.getObjectById(UserWithAddress.class, 1);
        System.out.println(user2);

        DBConnection.closeSessionFactory();
    }
}
