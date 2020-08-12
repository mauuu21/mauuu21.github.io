
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
public class TimerWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give a Number: ");
        int number = scan.nextInt();
        System.out.println(number);
            while(number != 0){
                if (number < 0) {
                    number++;
                } else if (number > 0){
                    number--;
                  }
                System.out.println(number);
            }
    }
}
