package Homework;

public class udali {
    public static void main(String[] args) {
        String s = "WelcomeToDevXSchool";
        int a=s.indexOf("D");
        int b = s.indexOf("X");
        System.out.println(s.substring(a,b+1));
        int f=s.indexOf("S");
        System.out.println(s.substring(f));
    }
}
