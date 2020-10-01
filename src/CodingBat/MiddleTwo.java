package CodingBat;

import java.util.Arrays;

public class MiddleTwo {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4};
        MiddleTwo middleTwo = new MiddleTwo();
        System.out.println(Arrays.toString(middleTwo.makeMiddle(nums)));
    }
    public int[] makeMiddle(int[] nums) {
    int a = nums.length/2;
    int [] arr = new int[2];
    arr [0] = nums[a-1];
    arr [1] = nums[a];
    return arr;
    }
}
