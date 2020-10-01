package DataTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        /**
         * Create a shopping cart List so that when you add it doesn't repeat
         * It would return a List of product name and quantity
         *
         * ex:
         * out: Please enter a product item:
         *  in: Apple
         * out: Are you done?
         *  in: No
         * out: Please enter a product item:
         *  in: Pear
         * out: Are you done?
         *  in: No
         * out: Please enter a product item:
         *  in: Apple
         * out: Are you done?
         *  in: Yes
         * out: Your cart has:
         * out: [apple: 2, pear: 1]
         *
         * Note: your list should be [item: numberOfItem, item: numberOfItem]
         */

        Shopping shopping = new Shopping();
        Scanner scanner = new Scanner(System.in);

        List<String> cartInfo = shopping.createCart(scanner);
        System.out.println("Your cart has:\n" + cartInfo);
    }

    public List<String> createCart(Scanner scanner) {
        //TODO implement this method
        List <String> list1 = new ArrayList<>();
        System.out.println(" Please enter a product item:");
        list1.add(scanner.nextLine());
        System.out.println("Are you done?");
        String str = scanner.nextLine();
        while (str.equals("No")){
            System.out.println(" Please enter a product item:");
            list1.add(scanner.nextLine());
            System.out.println("Are you done?");
            str = scanner.nextLine();
        }
        int c = 0;
        for(int i=0;i< list1.size();i++) {
            for (int j = i + 1; j < list1.size(); j++) {
                if (list1.get(i).equals(list1.get(j))){
                    c++;
                    list1.remove(j);
                }
            }
            list1.add(i,list1.get(i)+" " + c);
        }

        return list1;
    }
}
