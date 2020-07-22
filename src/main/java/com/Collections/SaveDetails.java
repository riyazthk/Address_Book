package com.Collections;

import com.User.UserObjects;

import java.util.*;

public class SaveDetails {
    UserObjects userobjects=new UserObjects();
    public static HashMap<String, UserObjects> hashmap=new HashMap<>();
    Scanner sc=new Scanner(System.in);

    public void sorting(){
        TreeMap<String,UserObjects> sorted=new TreeMap<>();
        sorted.putAll(hashmap);
        for (Map.Entry<String,UserObjects>entry:sorted.entrySet()){
            System.out.println("key="+entry.getKey() + " "+"value="+entry.getValue().getLastName() + entry.getValue().getAddress() +
                    entry.getValue().getCity() + entry.getValue().getState()+entry.getValue().getPhNum()+entry.getValue().getZip());
        }
    }

    public void sortValues(){
        Map<String, String> map = sortByValues(hashmap);
        System.out.println("After Sorting:");
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry me2 = (Map.Entry)iterator2.next();
            System.out.print(me2.getKey() + ": ");
            System.out.println(me2.getValue());
        }
    }
    private static HashMap sortByValues(HashMap hmap) {
        List list=new LinkedList(hmap.entrySet());
        Collections.sort(list,new Comparator() {
            public int compare(Object o1,Object o2) {
                UserObjects us1=(UserObjects)o1;
                UserObjects us2=(UserObjects)o2;
                return us1.getCity().compareTo(us2.getCity());
            }
        });
        HashMap sortedMap=new LinkedHashMap();
        for(Iterator it=list.iterator();it.hasNext();) {
            Map.Entry entry=(Map.Entry)it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

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

    public  void editUser(){
        System.out.println(hashmap);
        System.out.println("enter a name which one you want to delete");
        String name = sc.next();
        hashmap.remove(name);
    }

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
    public void viewPerson(){
       for(Map.Entry<String,UserObjects>entry:hashmap.entrySet()){
           System.out.println(entry.getKey()+" "+entry.getValue().getCity()+" "+entry.getValue().getState());
       }
    }


    public void saveUser(){
        hashmap.put(userobjects.getFirstName(),userobjects);
        System.out.println(hashmap);
    }
}
