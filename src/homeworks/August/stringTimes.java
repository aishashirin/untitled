package homeworks.August;

import java.util.Scanner;

public class stringTimes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int n = s.nextInt();
        stringTimes(str,n);
    }
    public static void stringTimes (String s , int n){
        for(int i = 0 ; i<n;i++){
            System.out.print(s);
        }
    }
}
