
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
public class To0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give a number: ");
        long number = scan.nextLong();
        System.out.println(number);
        for (number = number; number != 0 || number > 0; number = number) {
            if(number > 0){
                --number;
                System.out.println(number);
            }else{
                ++number;
            System.out.println(number);
            }
        }
    }
}
