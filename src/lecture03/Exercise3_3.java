package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1つ目の整数を入力してください:");
        String num1 = scanner.next();
        int a = Integer.parseInt(num1);
        System.out.println("2つ目の整数を入力してください:");
        String num2 = scanner.next();
        int b = Integer.parseInt(num2);

        int c = a + b;

        System.out.println(a + "+" + b + "=" + c);
    }
}
