package com.Collections;

import com.User.UserObjects;

import java.util.HashMap;

public class SaveDetails {
    UserObjects userobjects=new UserObjects();
    HashMap<String, UserObjects> hashmap=new HashMap<>();

    public void saveUser(){
        hashmap.put(userobjects.getFirstName(),userobjects);
        System.out.println(hashmap);
    }
}
