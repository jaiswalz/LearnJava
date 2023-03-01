package JavaLearning;

import java.util.Scanner;

public class Niven {

    public static void main(String[] args) {
        int n,num,r;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number=");
        n=sc.nextInt();
        num=n;
        while(num>0)
        {
            r=num%10;
            sum=sum+r;
            num=num/10;

        }
        if(n%sum==0)
        {
            System.out.println("NIven Number");
        }
            else
        {
            System.out.println("Not a niven numberssss ");

        }
    }
    
}
