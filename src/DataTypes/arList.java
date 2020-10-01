package DataTypes;

import java.util.ArrayList;
import java.util.List;

public class arList {
    public static void main(String[] args) {
        /**
         * Write a java function that returns lines of stars
         * so that when it is printed out, it displays a Pyramid
         *
         * ex: This list of stars will return a pyramid once it is print out line by line
         * [         * ,         * * ,        * * * ,       * * * * ,      * * * * * ,     * * * * * * ,    * * * * * * * ,   * * * * * * * * ,  * * * * * * * * * , * * * * * * * * * * ]
         *
         * output:
         *          *
         *         * *
         *        * * *
         *       * * * *
         *      * * * * *
         *     * * * * * *
         *    * * * * * * *
         *   * * * * * * * *
         *  * * * * * * * * *
         * * * * * * * * * * *
         *
         */

        printStars(10).forEach(System.out::println);
    }

    public static List<String> printStars(int n) {
        //TODO implement this method
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) { //outer loop for lines
            String str = "";
//
//                        10-i
            for (int j = n - i; j > 1; j--) { //Inner space loop
                str += " ";
            }
            for (int k = 0; k <= i; k++) { //Inner star loop
                str += "* ";

            }
            list.add(str);
        }
        return list;
    }


    }

