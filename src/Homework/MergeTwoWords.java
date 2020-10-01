package Homework;

public class MergeTwoWords {


        public static void main(String[] args) {
            /**
             * Merge two words with three characters one by one and print them
             * if words have more than three characters print Error message "Incorrect input! Cannot merge".
             *
             * ex
             * "ice", "sea"
             *
             *
             * output:
             * isceae
             *
             * ex2:
             * "Hot", "Day"
             *
             * output:
             * HDoaty
             *
             */

            String word1 = "ice";
            String word2 = "sea";
            System.out.println("Merging words: " + word1 + ", " + word2);
            new MergeTwoWords().printMerge(word1, word2);
        }

        public void printMerge(String word1, String word2) {
            //TODO implement method
            String result = "";
            if(word1.length()<=3 && word2.length()<=3){
                for(int i=0;i<word1.length();i++){
                    System.out.print(word1.charAt(i));
                    System.out.print(word2.charAt(i));
                }
                System.out.println(result);
            }
            else{
                System.out.println("Incorrect input! Cannot merge");
            }

        }
    }

