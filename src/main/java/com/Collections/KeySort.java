package com.Collections;

import com.Collections.SaveDetails;
import com.User.UserObjects;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class KeySort {
    HashMap<String, UserObjects> hashmap= SaveDetails.hashmap;
    public void sorting(){
        TreeMap<String,UserObjects>sorted=new TreeMap<>();
        sorted.putAll(hashmap);
        for (Map.Entry<String,UserObjects>entry:sorted.entrySet()){
            System.out.println("key="+entry.getKey() + " "+"value="+entry.getValue().getLastName() + entry.getValue().getAddress() +
            entry.getValue().getCity() + entry.getValue().getState()+entry.getValue().getPhNum()+entry.getValue().getZip());
        }
    }

}
