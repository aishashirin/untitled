package homeworks.August;

import java.util.Scanner;

public class checkerPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = s.nextInt();
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if ((row % 2) == 0) {
                    System.out.print(" ");
                }
                System.out.print(" "+"#");
            }
            System.out.println();
        }
    }
}
