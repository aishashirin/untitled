package Homework;

import java.util.Scanner;

public class front3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String r = "";

        if(str.length()>3){
           r = str.substring(0,3)+str.substring(0,3)+str.substring(0,3);
        }
        else{
            r = str + str + str;
        }
        System.out.println(r);
    }
}
