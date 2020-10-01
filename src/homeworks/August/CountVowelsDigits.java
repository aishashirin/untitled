package homeworks.August;

import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter String: ");
        String ss = s.nextLine().toLowerCase();
        int vowels=0; int digits =0;
        for(int i=0;i<ss.length();i++){
            char ch = ss.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            else if( ch >= '0' && ch <= '9')
            {
                ++digits;
            }
        }
        double perofvowel=vowels*100/ss.length();;
        double perofdigitits=digits*100/ss.length();
        String formatVowel = String.format("%.2f", perofvowel);
        String formatDigit = String.format("%.2f", perofdigitits);
        System.out.println("Number of vowels: " + vowels + "(" + formatVowel + ")");
        System.out.println("Number of digits: " + digits + "(" + formatDigit + ")");

    }
}
