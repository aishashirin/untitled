package DataTypes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class hashMapEx1 {
    public static void main(String[] args) {
       Map <Integer,String> zipAndCity = new HashMap<>(); //we can put also arrays,sets,list to value
        Scanner scanner = new Scanner(System.in);

        zipAndCity.put(60611,"Chicago");
        zipAndCity.put(60612,"Oklahoma");
        zipAndCity.put(60613,"Orlando");
        zipAndCity.put(60614,"Milwaukee");
        zipAndCity.put(60615,"Sacramento");
        System.out.println("enter the key: ");
        int key = scanner.nextInt();
        if(zipAndCity.containsKey(key)){
            System.out.println(zipAndCity.get(key));
        }
        Map <Integer,String> map2 = new HashMap<>();
        map2.putAll(zipAndCity);
        System.out.println(map2);
//
////        System.out.println("Please enter zip-code<to get city: ");
////        Integer zipCode = scanner.nextInt();
////        System.out.println("The city: " + zipAndCity.get(zipCode));
//        System.out.println(zipAndCity.containsKey(60613));
//      //  zipAndCity.remove(60612);
//        System.out.println(zipAndCity.remove(60612));
//
//        System.out.println("replacing " + zipAndCity.replace(60615,"hawaii"));
//        System.out.println(zipAndCity);

    }
}
