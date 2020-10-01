package Homework;

import java.util.Scanner;

public class NameManipulation {
    public static void main(String[] args) {
       // System.out.println("Enter your full name: ");

        //Scanner s = new Scanner(System.in);
      //  String fullName = s.nextLine();

        NameManipulation nameManipulation = new NameManipulation();
       // System.out.println("Full name is: " + nameManipulation.UpperCase(fullName));
        System.out.println(nameManipulation.UpperCase("leo messi"));

    }



    public String UpperCase(String fullName) {
        int indexS = fullName.indexOf(" ");
        String n="";
        n = fullName.substring(0, 1).toUpperCase().substring(indexS + 1, indexS + 2).toUpperCase();
        return n;

    }
    public String initials ( String fullName){
        String in = fullName.substring(0,1).toUpperCase();
        int indexS = fullName.indexOf(" ");
        String in2 = fullName.substring(indexS+1,indexS+2).toUpperCase();
        String initials = in + in2;
        return initials;

    }
}