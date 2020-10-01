package homeworks.August;

import java.util.*;

public class udali {
    public static void main(String[] args) {

            /**
             * Write a function that takes in a non-empty list of distinct integers, and an integer representing target sum.
             * If any two numbers in the input list sum up to the target sum, the function should return them in a list, in any order.
             * If no two numbers sum up to the target sum, the function should return an empty list;
             */

            List<Integer> list = Arrays.asList(3, 5, -4, 8, 11, 1, -1, 6);
            int targetSum = 10;
        udali twoNumberSum = new udali();

            List<Integer> noDuplicateList = twoNumberSum.removeDuplicates(list);
            List<Integer> twoNumbers = twoNumberSum.find(noDuplicateList, targetSum);
            System.out.println(twoNumbers);
        }

        public List<Integer> removeDuplicates(List<Integer> numbers) {
            List <Integer> liist = new ArrayList<>();
            for (int i=0;i<numbers.size();i++){
            if (!liist.contains(numbers.get(i))){
                liist.add(numbers.get(i));
            }
            }
            return liist;
        }

        public List<Integer> find(List<Integer> numbers, int targetSum) {

        List <Integer> liist = new ArrayList<>();
            for (int i=0;i<numbers.size();i++){
                for(int j=i+1;j<numbers.size();j++){
                if(numbers.get(i) + numbers.get(j) == targetSum){
                  liist.addAll(numbers);
                  break;
                }
            }
            }
            return liist;
            }

        }


