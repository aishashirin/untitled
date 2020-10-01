package ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class querryMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap <String,Integer> phoneBook = new HashMap<>();
        scanner.nextLine();
        for (int i=0;i<n;i++){
            String s = scanner.nextLine();
            int a = scanner.nextInt();
            phoneBook.put(s,a);
            scanner.nextLine();
        }


       while (scanner.hasNext()){
           String toFind = scanner.nextLine();
            if(phoneBook.containsKey(toFind)){
                System.out.println(toFind +"=" + phoneBook.get(toFind));
            }
            else
                System.out.println("Not found");
        }

    }
}
