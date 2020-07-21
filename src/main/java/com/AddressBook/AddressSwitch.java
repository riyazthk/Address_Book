package com.AddressBook;

import com.Collections.DeleteAddress;
import com.Collections.EditAddress;
import com.Collections.KeySort;
import com.User.UserDetails;

import java.util.Scanner;

public class AddressSwitch {
    Scanner sc=new Scanner(System.in);
    UserDetails userdetails=new UserDetails();
    EditAddress editaddress=new EditAddress();
    DeleteAddress deleteaddress=new DeleteAddress();
    KeySort keysort=new KeySort();
    public void addressBook(){
        System.out.println("1.add 2.edit 3.delete 4.sort by key");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
                userdetails.addUserInput();
                break;
            case 2:
                editaddress.editDetails();
                break;
            case 3:
                deleteaddress.editUser();
                break;
            case 4:
                keysort.sorting();

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
