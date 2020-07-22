package com.AddressBook;

import com.Collections.SaveDetails;
import com.User.UserDetails;

import java.util.Scanner;

public class AddressSwitch {
    Scanner sc=new Scanner(System.in);
    UserDetails userdetails=new UserDetails();
    SaveDetails savedetails=new SaveDetails();
    public void addressBook(){
        System.out.println("1.add 2.edit 3.delete 4.sort by key 5.sort by value 6.view person 7.search person");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
                userdetails.addUserInput();
                break;
            case 2:
                savedetails.editDetails();
                break;
            case 3:
                savedetails.editUser();
                break;
            case 4:
                savedetails.sorting();
                break;
            case 5:
                savedetails.sortValues();
                break;
            case 6:
                savedetails.viewPerson();
                break;
            case 7:
                savedetails.searchPerson();
                break;

        }
    }
    public void againContinue(){
        boolean flag=true;
        System.out.println("1.again 2.exit");
        while(flag) {
            int again = sc.nextInt();
            if (again == 1) {
                addressBook();
                flag=true;
            } else {
                System.out.println("Thank you!!!");
                flag=false;
            }
        }
    }
}
