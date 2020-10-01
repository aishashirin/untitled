package CodingBat;

import java.util.Arrays;

public class Fix23 {
    public static void main(String[] args) {
        int [] a =  {1,2,3};
        Fix23 fix23 = new Fix23();
        System.out.println(Arrays.toString(fix23.fix23(a)));
    }
    public int[] fix23(int[] nums) {
        for(int i = 0; i<3; i++){
            if(nums[i] == 2 && nums[i+1] == 3){
                nums[i+1] = 0;
            }
        }
        return nums;
    }

}
