package lecture01;

import java.util.Scanner;

public class kadai04 {
    public static void main (String[] args){
        int [] array = new int[100];
        int sum = 0;
        for(int i=0;i<array.length;i++){
            array[i] = i+1;
            if(i%2==0){
               sum = sum + array[i];
            }
        }
        System.out.print("配列の番号が偶数の総和：" + sum);
    }
}
