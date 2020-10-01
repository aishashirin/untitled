package Homework;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        System.out.println("Input the 5 numbers : ");

        Scanner scan=new Scanner(System.in);
        int a =scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=scan.nextInt();
        int e= scan.nextInt();

        int sum=a+b+c+d+e;
        double average= sum/5;
        System.out.println("The sum of 5 numbers is: " + sum);
        System.out.println("The average is: " + average);
    }
}
