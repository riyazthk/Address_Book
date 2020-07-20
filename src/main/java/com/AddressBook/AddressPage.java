package com.AddressBook;
import com.User.UserDetails;

import java.io.IOException;
import java.util.Scanner;

public class AddressPage
{
    public static void main(String[] arg) throws IOException
    {
            UserDetails userdetails=new UserDetails();
            Scanner sc=new Scanner(System.in);
            System.out.println("1.add 2.edit 3.delete 4.sort by last name 5.sort by zipcode 6.print a data");
            int n=sc.nextInt();
            switch(n)
            {
                case 1:
                    userdetails.addUserInput();
                    break;
            }
    }
}


