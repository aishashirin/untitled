package CodingBat;

import java.util.Arrays;

public class makeLast {
    public static void main(String[] args) {
        int [] ar = {4,5,6};
        makeLast makeLast = new makeLast();
        System.out.println(Arrays.toString(makeLast.MakeLast(ar)));
    }
    public int[] MakeLast(int[] nums) {
    int size = nums.length * 2;
    int [] a = new int[size];
    for(int i = 0;i<size;i++){
        a[i] = 0;
    }
    a [a.length - 1] = nums[nums.length-1];
    return a;
    }
}
