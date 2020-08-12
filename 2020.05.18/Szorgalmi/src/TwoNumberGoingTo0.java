
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author morva
 */
public class TwoNumberGoingTo0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I need 2 number!");
        System.out.print("Number1: ");
        long number1 = scan.nextLong();
        System.out.print("Number2: ");
        long number2 = scan.nextLong();
        long i = 0;
        if(number1 >= number2){
            i = number1;
        } else if(number2 >= number1) {
            i = number2;
          }
        for (i = i; i == i; i = i) {
           if(number1 % i ==0 && number2 % i ==0){
               System.out.println("legnagyobb közös osztó: " + i);
               return;
           } else {
               --i;
           }
        }
    }
}
