package CodingBat;

import java.util.Scanner;

public class withoutX {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        withoutX withoutX = new withoutX();
        System.out.println(withoutX.WithoutX(str));
    }
    public String WithoutX(String str) {
    String s;
    if(str.charAt(0) == 'x' && str.charAt(str.length()-1) == 'x'){
        s=str.substring(1,str.length()-1);
    }
    else if(str.charAt(0) == 'x' ){
        s = str.substring(1);
    }
    else if(str.charAt(str.length()-1) == 'x'){
        s = str.substring(0,str.length()-1);
    }
    else
        s = str;
    return s;
    }

}
