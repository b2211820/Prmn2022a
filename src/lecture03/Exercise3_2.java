package lecture03;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("何行分入力しますか？");
        int input = scanner.nextInt();

        ArrayList<String> mojiretu = new ArrayList<>();
        scanner.nextLine();
        for (int i = 1; i <= input; i++) {
            System.out.println(i + "行目を入力してください:");
            String moji = scanner.nextLine();
            mojiretu.add(moji);
        }

        System.out.println("入力した文字列:");
        for(String m : mojiretu) {
           System.out.println(m);
        }
    }
}
