package com.User;

import java.io.IOException;
import java.util.Scanner;

public class UserDetails
{
    String firstname;
    String lastname;
    String address;
    String city;
    String zip;
    String phnum;

    Scanner sc=new Scanner(System.in);
    public void addUserInput() throws IOException
    {
        System.out.println("enter a first name");
        String firstname=sc.next();
        System.out.println("enter a second name");
        String lastname=sc.next();
        System.out.println("enter a address");
        String address=sc.next();
        System.out.println("ente a city name");
        String city=sc.next();
        System.out.println("enter a state name");
        String state=sc.next();
        System.out.println("enter your postal code");
        String zip=sc.next();
        System.out.println("enter a your phone number");
        String phnum=sc.next();
        UserObjects userobjects=new UserObjects(firstname,lastname,address,city,state,zip,phnum);
    }
}
