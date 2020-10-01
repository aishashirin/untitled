package ex;

import java.util.HashMap;

public class letterFreq {
    public static void main(String[] args) {
        String str = "hello ";
        letterFreq letterFreq = new letterFreq();
        System.out.println(letterFreq.method(str));
    }
   public HashMap <Character,Integer> method(String str){
        HashMap <Character,Integer> resultMap = new HashMap<>();
        char [] strToChar = str.toCharArray();
        for(char word : strToChar){
           if(!resultMap.containsKey(word)){
               resultMap.put(word,1);
           }
           else
           resultMap.put(word,resultMap.get(word)+1);
       }

        return resultMap;
    }

}
//