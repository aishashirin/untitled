package homeworks.August;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class LetterToNextLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String foo = scanner.next();
        StringBuilder bar = new StringBuilder();

        for (char c : foo.toCharArray()) {

            bar.append(Character.toString((char) (((c - 'a' + 1) % 26) + 'a')));
        }
        char upperVowel = 0;
        for(int i=0;i<bar.length();i++){
            char ch = bar.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' //not working
                    || ch == 'o' || ch == 'u') {
                 upperVowel = Character.toUpperCase(ch);
                
            }
            bar.toString().replace(ch,upperVowel);
        }

        System.out.println(bar);
    }
}
