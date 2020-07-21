package com.Collections;

import com.User.UserDetails;
import com.User.UserObjects;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class EditAddress {
    Scanner sc = new Scanner(System.in);
    HashMap<String, UserObjects> hashmap = new HashMap<>();
    UserObjects userobjects= new UserObjects();
    public void editDetails() {
        System.out.println(hashmap);
        System.out.println("enter a name which one you want to delete");
        String name = sc.next();
        Iterator<Map.Entry<String, UserObjects>> iterator = hashmap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, UserObjects> entry = iterator.next();
            if (name.equals(entry.getKey())) {
                System.out.println("Enter a choice which one want to delete 1.address 2.city 3.state 4.pinCode 5.phNum");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("enter a new address");
                        String address = sc.next();
                        userobjects.setAddress(address);
                        break;
                    case 2:
                        System.out.println("enter a new city");
                        String city = sc.next();
                        userobjects.setCity(city);
                        break;

                    case 3:
                        System.out.println("enter a new state");
                        String state = sc.next();
                        userobjects.setState(state);
                        break;

                    case 4:
                        System.out.println("enter a new pinCode");
                        String zipCode = sc.next();
                        userobjects.setZip(zipCode);
                        break;

                    case 5:
                        System.out.println("enter a new phNum");
                        String phNum = sc.next();
                        userobjects.setPhNum(phNum);
                        break;
                }

            }
        }
        System.out.println(hashmap);
    }
}