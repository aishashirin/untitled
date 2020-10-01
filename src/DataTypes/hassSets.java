package DataTypes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class hassSets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List <Integer> list1 = new ArrayList<>();
        for(int i = 0; i<n; i++){
            list1.add(s.nextInt());
        }
        int q = s.nextInt();
        System.out.println("Insert");
        int index = s.nextInt();
        int element = s.nextInt();
       if(list1.size()-1>=index){
           list1.set(index,element);
       }
       else{
           list1.add(element);
       }
        System.out.println("Delete");
        int indexd = s.nextInt();
        list1.remove(indexd);
        System.out.println(list1);
    }
}
