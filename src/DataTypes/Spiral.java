package DataTypes;

import java.util.ArrayList;
import java.util.List;

class SpiralTraverse {
    //Write a function that takes in a two dimensional array and returns a one dimensional ArrayList of all the array's element in spiral order.

    //Sprial order start at the top lef corner of the two dimensional array, goes to the right, and proceeds
    //in a spiral pattern all the way until every element has been visited
    public static void main(String[] args) {
        SpiralTraverse sp = new SpiralTraverse();

        int[][] array = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}};
        System.out.println(sp.spiralTraverse(array));
    }

    public List<Integer> spiralTraverse(int[][] array) {
//        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println("");
//        }
//        return result;
//    }
        ArrayList<Integer> arrlst = new ArrayList<>();
        int num = array.length * array[0].length;
        int idx = 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array[j].length; k++) {
                    if (array[j][k] == idx) {
                        arrlst.add(array[j][k]);
                    }
                }
            }
            idx++;
        }
        return arrlst;
    }
}
