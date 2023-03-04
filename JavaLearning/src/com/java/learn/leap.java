import java.util.Scanner;
public class leap {
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year");
        year=sc.nextInt();
        if(((year%400==0)||(year%4==0))&&(year%100!=0)) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a leap year");

        }

    }

}

