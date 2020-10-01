package Homework;

import java.util.Scanner;

public class MiddleOne {
    public static void main(String[] args) {
        /**
         * Write a java program that prints middle char(s)
         *  1) when odd number of chars and more than 2 chars, print a middle character. ex: cat -> a
         *  2) when even number of chars and more than 3 chars, print 2 middle characters. ex: java -> av
         *  3) if a single character, print character 3 times. ex: & -> &&&
         *  4) if a double character, print characters 2 times. ex: @@ -> @@@@
         */

        Scanner scanner = new Scanner(System.in);
        MiddleOne middleOne = new MiddleOne();
        int position;
        System.out.println("Input:");
        String text = scanner.nextLine();
        position = text.length() / 2 ;// house
        System.out.println(position);
       /* System.out.println("Middle One:");
        middleOne.printMiddleOne(text);

    }

    public void printMiddleOne(String text) {
        //TODO implement me
        int position;
        int length;
        if(text.length() == 1){
            System.out.print(text+text+text);
    }
        else if(text.length() == 2){
            System.out.print(text+text);
        }
        else if(text.length() % 2 == 0){
            position = text.length() / 2 - 1;     // homework = 8/2 -1 -> 3 ;l=2 --> {3, 5}
            length = 2;
            System.out.println( text.substring(position, position + length));
        }
        else{
            position = text.length() / 2 ;// house
            System.out.println(position);
            length = 1;
            System.out.println(text.substring(position,position + length));

        }*/
}
}
