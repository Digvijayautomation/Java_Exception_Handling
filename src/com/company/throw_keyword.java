package com.company;
//Using throw keyword we can create our custom exceptions
// In this everything is done explicitly

import java.util.Scanner;

public class throw_keyword {

    public static void main(String[] args) {

        int ac_bal=2000;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Rs To Be Withdrawal");
      int withdraw_amount=  sc.nextInt();

        if (withdraw_amount>ac_bal)
        {
            throw new ArrayIndexOutOfBoundsException(); //new ArrayIndexOutOfBoundsException()- this will create new object of exception
            //throw- handovers of created object to JVM
        }
        else
        {
            System.out.println("Withdraw Success");
        }

    }
}
