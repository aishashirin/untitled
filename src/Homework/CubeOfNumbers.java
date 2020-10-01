package Homework;

import java.util.Scanner;

public class CubeOfNumbers {
    public static void main(String[] args) {
        System.out.println("Input number of terms :");

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int cube=0;

        for(int i=n;i>=1;--i){
            cube= i^3;
            System.out.println("Cube of number "+n+" is equal to= "+ cube);
        }


    }
}
