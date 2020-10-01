package DataTypes;

import java.util.HashMap;

class workWithMapsss {
    public static void main(String[] args) {
        HashMap <String,Integer> map1 = new HashMap<>();
        map1.put("Red",1);
        map1.put("Green",2);
        map1.put("Black",3);
        map1.put("White",7);
        System.out.println(map1);
        if(map1.containsKey("Green")){
            System.out.println("yes");
        }
        else
            System.out.println("False");
    }
}
