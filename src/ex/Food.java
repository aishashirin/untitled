package ex;

import java.util.ArrayList;

public class Food {
    String name;
    String taste;
    ArrayList<String> ingredients = new ArrayList<>();
    int levelOfSatiety;

    public int getLevelOfSatiety() {
        return levelOfSatiety;
    }

//    public Food(int levelOfSatiety) {
//        this.levelOfSatiety = levelOfSatiety;
//    }
}
