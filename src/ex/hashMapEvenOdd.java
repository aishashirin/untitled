package ex;

import java.util.HashMap;

public class hashMapEvenOdd {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        evenOddFreq(array);
    }
    public static void  evenOddFreq(int[] arr){
        HashMap<String,Integer> map1 = new HashMap<>();
        int even=0;
        int odd = 0;
        for(int i = 0;i< arr.length;i++){
            if(arr[i] % 2 == 0){
                even++;
            }
            else
                odd++;
        }
        map1.put("even",even);
        map1.put("odd",odd);
        System.out.println(map1);
    }
}
