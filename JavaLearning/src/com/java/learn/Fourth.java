package com.java.learn;

import java.util.Scanner;

public class Fourth
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); //Object Creation
        int number = sc.nextInt();//Input
        Fourth fourth = new Fourth();//Object creation
        boolean result = fourth.isNumberNiven(number);//Method calling
        if(result)
        {
            System.out.print("A Niven Number");
        }
        else {
            System.out.print("Not a niven Number");
        }
    }

    /**
     *
     *  access specifier:private
     *  boolean :return type
     *  isNumberNiven : methodName
     *  number : parameter
     *  @param number
     *  @return
     */
    public boolean isNumberNiven(int number) //204
    {
        int number1=number;
       int remainder =1;
       int sum=0;
       while(number!=0)
       {
           remainder = number%10;
           sum = sum + remainder;
           number = number /10;
       }

       if(number1 % sum ==0)
           return true;
       else
           return false;
    }
}
