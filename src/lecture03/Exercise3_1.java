package lecture03;

import java.util.Scanner;

public class Exercise3_1 {
    public static void main(String[] args) {
        System.out.println("文字列を入力してください:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("入力された文字列:" + input);
    }
}
