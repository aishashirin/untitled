package CodingBat;

import java.util.Scanner;

public class deFront {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        deFront deFront = new deFront();
        System.out.println(deFront.DeFront(str));
    }
    public String DeFront(String str) {
        String s;
        if(str.charAt(0) == 'a' && str.charAt(1) == 'b'){
            s=str;
        }
        else if(str.charAt(0) == 'a' ){
            s = str.substring(0,1) + str.substring(2);
        }
        else if(str.charAt(1) == 'b'){
            s = str.substring(1);
        }
        else{
            s=str.substring(2);
        }
        return s;
    }
}
