package com.Collections;

import com.User.UserObjects;

import java.util.HashMap;
import java.util.Scanner;

public class DeleteAddress {
    Scanner sc = new Scanner(System.in);
    HashMap<String, UserObjects> hashmap = new HashMap<>();
    UserObjects userobjects= new UserObjects();
    public  void editUser(){
        System.out.println(hashmap);
        System.out.println("enter a name which one you want to delete");
        String name = sc.next();
        hashmap.remove(name);
    }
}
