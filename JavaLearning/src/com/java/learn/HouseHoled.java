package com.java.learn;

import java.util.Scanner;

public class HouseHoled
{
    public static void main(String args[])
    {
        //Input from user : Earning ,Expenditure  O/p : Savings

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Earning");
        double earning = sc.nextDouble();
        System.out.println("Please Enter Expenditure");
        double exp = sc.nextDouble();
        double savings = earning - exp;
        System.out.println("Savings = "+ savings);

    }
}
