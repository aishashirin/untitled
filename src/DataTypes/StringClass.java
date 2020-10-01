package DataTypes;//strings

public class  StringClass {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = " world";

        str=str.concat(str2);
        System.out.println(str);

        System.out.println(str.substring(2,6));
        System.out.println(str.equals(str2)); //compare

        System.out.println(str.toUpperCase());

    }
}