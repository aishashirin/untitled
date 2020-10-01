package homeworks.August;

import java.util.Scanner;

public class firstToUppercase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ss = s.nextLine();

        System.out.println(ss.substring(0,1).toUpperCase() + ss.substring(1));
    }
}
