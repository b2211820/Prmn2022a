package lecture06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++){
            list.add(random.nextInt(1,7));
        }

        System.out.println("サイコロを5つ振りました。");

        Scanner input = new Scanner(System.in);
        System.out.println("何番目のサイコロの値を確認しますか？");

        try {
            int number = input.nextInt();
            System.out.println("サイコロの値:" + list.get(number));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外アクセスを確認しました。");
        }
        catch (InputMismatchException e){
            System.out.println("整数以外の値が入力されました。");
        }
    }
}
