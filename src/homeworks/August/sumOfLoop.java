package homeworks.August;

import java.util.Scanner;

public class sumOfLoop {
    public static void main(String[] args) {
        System.out.print("Number: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum =0;
        for(int i=0;i<n;i++){
            int w =s.nextInt();
            sum += w;
        }
        System.out.println("The sum is:"+sum);
    }
}
