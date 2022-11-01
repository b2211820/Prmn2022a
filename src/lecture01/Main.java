package lecture01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("B2211820 Haruto Nishizawa");
        //int studentNumber = 2211820;
        // System.out.println("B" + studentNumber + " Haruto Nishizawa");

      System.out.println("input number");
      Scanner input = new Scanner(System.in);
      int age = input.nextInt();

      if(age < 20){
          System.out.println("I am "+ age +" years old so I cannot drink liquor");
      }
      else{
          System.out.println("I am "+ age +" years old so I can drink liquor");
      }

    }
}
