package homeworks.August;

import java.util.Scanner;

public class addingValuesInLoop {
    public static void main(String[] args) {
        System.out.println("I will add up the numbers you give me.");
        Scanner s = new Scanner(System.in);
        System.out.print("number:");
        int n = s.nextInt();
        int total =n;
        System.out.println("The total so far is " + n);
        while(n!=0){
            System.out.print("Number:");
            n=s.nextInt();
            total += n;
            System.out.println("The total so far is " + total);
        }
        System.out.println("The total is "+total);
    }
}
