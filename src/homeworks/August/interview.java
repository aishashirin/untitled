package homeworks.August;

import java.util.Scanner;

public class interview {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your years in college: ");
        int yc = s.nextInt();
        System.out.print("Enter your years of programming experience: ");
        int ye = s.nextInt();
        System.out.print("Enter your GPA: ");
        double gpa = s.nextInt();
        System.out.println( CallOrNo(yc,ye,gpa));
    }
    public static boolean CallOrNo (int a,int b, double c){
        if(a >= 4 && b >=2 || c >= 3.5){
            return true;
        }
        else
            return false;
    }
}
