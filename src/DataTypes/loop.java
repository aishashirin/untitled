package DataTypes;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        System.out.println("Type message: ");
        Scanner scan= new Scanner(System.in);

        String str= scan.nextLine();
        System.out.println("Message: " + str);

       // for(int i=0;i<5;i++){
          // System.out.println(str);
        int i=1;
        while(i<=5){
            System.out.println(i+ "." + " " +str);
            i++;
        }
    }
}
