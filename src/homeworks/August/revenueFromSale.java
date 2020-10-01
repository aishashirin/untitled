package homeworks.August;

import java.util.Scanner;

public class revenueFromSale {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Unit price: ");
        int price = s.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = s.nextInt();
        System.out.println("The revenue from sale: " + price*quantity + "$");
        double revafterDiscount = 0;
        if(quantity>120){
            revafterDiscount= (price * quantity) * 15 /100;
            System.out.println("After discount: "+revafterDiscount + "$" + "(15%)");
        }
        else if (quantity>= 100 && quantity <=120){
            revafterDiscount=(price * quantity) * 10/100;
            System.out.println("After discount: "+revafterDiscount + "$" + "(10%)");
        }
        else{
            revafterDiscount = price * quantity;
            System.out.println("After discount: "+revafterDiscount + "$" + "(0%)");
        }


    }
}
