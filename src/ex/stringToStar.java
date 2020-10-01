package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class stringToStar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> listString = new ArrayList<>();
        System.out.println("Enter how many words you put:");
        int inputWord = s.nextInt();
        for (int i = 0 ; i<inputWord;i++){
            listString.add(s.next());
        }
        stringToStar stringToStar = new stringToStar();
        System.out.println(stringToStar.strToStar(listString));
    }

    public List<String> strToStar(List<String> list1) {
        ArrayList<String> changedList = new ArrayList<>();
        for (int i=0; i<list1.size();i++){
            String word = list1.get(i);
                if(word.length() >=5){
                    word="*****";
                    changedList.add(i,word);
                }
                else{
                changedList.add(word);}
            }
      return  changedList;
    }
   }


