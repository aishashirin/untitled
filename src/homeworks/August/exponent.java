package homeworks.August;

import java.util.Scanner;

public class exponent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the base:");
        int base = s.nextInt();
        System.out.print("Enter the exponent:");
        int exp = s.nextInt();
        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
    }
    public static int exponent (int base,int exp){
        int product =1;
        for(int i=0;i<exp;i++){
            product *= base;
        }
        return product;
    }
}
