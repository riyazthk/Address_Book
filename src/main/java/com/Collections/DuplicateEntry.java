package com.Collections;

import com.User.UserObjects;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class DuplicateEntry {
    Scanner sc =new Scanner(System.in);
    HashMap<String, UserObjects> hashmap=SaveDetails.hashmap;
    UserObjects userobjects =new UserObjects();
    public void duplicateKey(String name){
        Iterator<Map.Entry<String, UserObjects>> iterator = hashmap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, UserObjects> entry = iterator.next();
            if (name.equals(entry.getKey())) {
                System.out.println("enter a another name");
                userobjects.setFirstName(sc.next());
            }
         }
    }
}
