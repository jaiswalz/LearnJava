package com.java.learn;

import java.util.Scanner;

/**
 * This is the third program of the lecture
 */
public class Third {
    /**
     * This is the starting point of Application
     * @param args
     */
    public static void main(String args[])
    {

        ///47+63 = 110
        String firstNumber,secondNumber;

        int firstNumber1,secondNumber1,sum;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        firstNumber=sc.next();//next() and nextLine()
        System.out.println("Enter second number");
        secondNumber=sc.next();

        firstNumber1 = Integer.valueOf(firstNumber);
        secondNumber1= Integer.valueOf(secondNumber);


        sum= firstNumber1 + secondNumber1 ;
        System.out.println(sum);

        Fourth fourth = new Fourth();//Object creation
        boolean result = fourth.isNumberNiven(sum);//Method calling
        if(result)
        {
            System.out.print("A Niven Number");
        }
        else {
            System.out.print("Not a niven Number");
        }

    }

    //Alphabet A-Z 65-90
    //a-z 97-122
    //0-9 48-57
}
