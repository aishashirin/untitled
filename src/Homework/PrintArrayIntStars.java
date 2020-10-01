package Homework;

import java.util.Scanner;

public class PrintArrayIntStars {
    public static void main(String[] args) {
      /*  Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int num = s.nextInt();
        System.out.println("Enter the value of all items ");
        int [] items =new int [num];
        for (int i = 0;i<num;i++){
            items[i]= s.nextInt();
        }*/
      /*  int [] a = {1, 2, 3};
        int [] b = {4, 5, 6};
        int [] c = {a[1],b[1]};
        for(int i=0;i<2;i++){
            System.out.print(c[i]+" ");
        }*/
//Given an array of ints, return a new array length 2 containing
// the first and last elements from the original array. The original array will be length 1 or more.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int  a [] = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        FirstLast(a);

}
public static void FirstLast ( int [] a){
        int [] b = {a[0],a[a.length-1]};
    if(a.length>1){
        for(int i=0;i<2;i++){
            System.out.print(b[i]+" ");
        }
    }
    else
        System.out.println("Array must be bigger than 1!");


}
}

