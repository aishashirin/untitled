package CodingBat;

import java.util.Arrays;

public class BiggerTwo {
    public static void main(String[] args) {
        int [] a = {1,2};
        int [] b = {3,4};
        BiggerTwo biggerTwo = new BiggerTwo();
        System.out.println(Arrays.toString(biggerTwo.biggerTwo(a, b)));
    }
    public int[] biggerTwo(int[] a, int[] b) {
    int sum1 = 0;
    int sum2 = 0;
    for(int i=0;i<2;i++){
        sum1 += a[i];
    }
    for (int i = 0; i<2;i++){
        sum2 += b[i];
    }
    if (sum1 > sum2){
        return a;
    }
    else if(sum1 == sum2){
        return a;
    }
    else
        return b;
    }
}
