package lecture01;

import java.util.Scanner;

public class kadai05 {
    public static void main (String[] args){
        int[] score = {41,85,72,38,80};

        Scanner input = new Scanner(System.in);

        Hantei h = new Hantei();
        h.output(score);

        Kansuu k = new Kansuu();
        int min = k.min(score);
        System.out.println("最低点"+ min);
        int max = k.max(score);
        System.out.println("最高点"+max);
        double average = k.average(score);
        System.out.println("平均点"+average);
    }
}
