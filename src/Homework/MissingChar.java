package Homework;

import java.util.Scanner;

public class MissingChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = scan.nextInt();
        System.out.println(missingChar(str,n));

    }
    public static String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }
}
