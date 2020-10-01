package DataTypes;

import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        Array Array = new Array();

      /*int array []  = {132,200,33,4100};

        System.out.println(Array.FindMin(array));
        System.out.println(Array.findMax(array));
        System.out.println(Array.Sum(array));
        int array1 [] = {2,66,20,23,776};
        System.out.println(Array.findMax(array1));*/

     /*   Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int a [] = new int[5];
        for(int i=0;i<5;i++){
            a [i] = scan.nextInt();
        }
        System.out.println(Array.findMax(a));*/

        int b [] = new int[10];
        System.out.println("Random Array:");
        for(int i=0;i<10;i++){
          b[i] = ((int)(Math.random() * 100));
            System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.print("max el= ");
        System.out.println(Array.findMax(b));
        System.out.print("min el= ");
        System.out.println(Array.FindMin(b));
        System.out.println("sum of rand arr = " + Array.Sum(b));
        Array.EvenOdd(b);
    }
    public int findMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max)
                max= array[i];
        }
        return max;
    }
    public int FindMin(int[] array){
        int min = array[0];
        for(int i=1;i< array.length;i++){
            if(array[i]<min)
                min = array[i];
        }
        return min;
    }
    public int Sum (int [] array){  //{10,6,8}
        int sum=0; //24
        for(int i=0;i< array.length;i++){
            sum=sum+array[i];  // sum=0+10+6+8
        }
        return sum;
    }
    public void EvenOdd(int array []){

        System.out.println("even numbers: ");
        for(int i=0;i< array.length;i++){
            if(array[i]%2==0){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("odd numbers:");
        for(int i=0;i< array.length;i++){
            if(array[i]%2==1){
                System.out.print(array[i] + " ");

            }
        }
        System.out.println(findMax(array));
    }
}
