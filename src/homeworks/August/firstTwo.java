package homeworks.August;

import java.util.Scanner;

public class firstTwo {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        String ss = s.nextLine();
        firstTwo(ss);
    }
    public static void firstTwo (String str){
        if(str.length() > 2){
            System.out.println(str.substring(0,2));
        }
        else{
            System.out.println(str);
        }
    }
}
