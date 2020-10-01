package homeworks.August;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        System.out.println("Type in a message, and I'll display it five times.");
        Scanner s = new Scanner(System.in);
        System.out.print("Message:");
        String str = s.nextLine();
        for(int i=1;i<=5;i++){
            System.out.println(i+"."+str);
        }

    }
}
