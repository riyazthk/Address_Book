
package com.User;

import com.Collections.DuplicateEntry;
import com.Collections.SaveDetails;

import java.io.IOException;
import java.util.Scanner;

public class UserDetails
{

    UserObjects userobjects=new UserObjects();
    DuplicateEntry duplicateentry=new DuplicateEntry();
    Scanner sc=new Scanner(System.in);
    public void addUserInput()
    {
        System.out.println("enter a first name");
        userobjects.setFirstName(sc.next());
        String name=userobjects.getFirstName();
        duplicateentry.duplicateKey(name);
        System.out.println("enter a second name");
        userobjects.setLastName(sc.next());
        System.out.println("enter a address");
        userobjects.setAddress(sc.next());
        System.out.println("enter a city name");
        userobjects.setCity(sc.next());
        System.out.println("enter a state name");
        userobjects.setState(sc.next());
        System.out.println("enter your postal code");
        userobjects.setZip(sc.next());
        System.out.println("enter a your phone number");
        userobjects.setPhNum(sc.next());

        SaveDetails savedetails=new SaveDetails();
        savedetails.saveUser();
    }
}

