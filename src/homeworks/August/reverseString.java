package homeworks.August;

public class reverseString {
    public static void main(String[] args) {
        String str = "abcdef";
        char[] try1 = str.toCharArray();

        for (int i = try1.length-1; i>=0; i--)
            System.out.print(try1[i]);
        System.out.println();
        StringBuilder sb = new StringBuilder("absdef");
        sb.reverse();
        System.out.println(sb);
        String input = "abcdef";

        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1
        input1 = input1.reverse();

        // print reversed String
        System.out.println(input1);
        char c [] = new char[5];
    }

}
