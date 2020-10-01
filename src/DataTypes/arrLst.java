package DataTypes;

import java.util.ArrayList;

public class arrLst {
    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(-1);
        arrLst arrLst = new arrLst();
        System.out.println(arrLst.smallestint(list1));
//        System.out.println("Original ArrayList: " + list1 );
//        System.out.println("Cloned Arraylist: " + joinLists(list1));
    }
//    public static ArrayList<Integer> joinLists(ArrayList<Integer> list1){
//        ArrayList <Integer> list2 = new ArrayList<>();
//        for(int i=0;i<list1.size();i++){
//            list2.add(list1.get(i));
//        }
//
//        return  list2;
//    }
    public int smallestint (ArrayList<Integer> list1){
        int min = list1.get(0);
        for (Integer integer : list1) {
            if (integer < min) {
                min = integer;
            }
        }
      return min;
    }
}
