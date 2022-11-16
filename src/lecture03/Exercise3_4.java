package lecture03;

import java.util.ArrayList;

public class Exercise3_4 {
    public static void main(String[] args) {
        ArrayList<Vegetable> vegetables = new ArrayList<>();

        Vegetable v1 = new Vegetable("にんじん",117);
        vegetables.add(v1);
        Vegetable v2 = new Vegetable("たまねぎ",120);
        vegetables.add(v2);
        Vegetable v3 = new Vegetable("じゃがいも",154);
        vegetables.add(v3);

        for(Vegetable vege : vegetables){
            vege.print();
        }

    }
}
