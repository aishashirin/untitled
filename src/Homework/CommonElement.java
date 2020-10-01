package Homework;

public class CommonElement {
    public static void main(String[] args) {
        int [] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int [] array2 = {1, 2,6, 15, 8,4, 7, 0};
        int  comm;
        System.out.print("Array1: ");
        for(int k=0;k< array1.length;k++){
            System.out.print(  array1[k]+" ");
        }
        System.out.println();
        System.out.print("Array2: ");
        for(int k=0;k< array1.length;k++){
            System.out.print(array2[k]+" ");
        }
        System.out.println();
        for(int i = 0; i< array1.length;i++){
                if(array1[i]==array2[i]){
                   comm = array1[i];
                    System.out.println("Common element is: "+comm);

            }
        }
    }
}
