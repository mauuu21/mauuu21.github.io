/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import java.util.Scanner;


public class GameTestWithWile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int randomNumber = (int)(Math.random()*16);
        System.out.println("Tipp?");
        int i = 1;
        int inputNumber = scan.nextInt();
        while(inputNumber != randomNumber && i < 10){
            System.out.println(":-(");
            System.out.println((inputNumber < randomNumber)? "Legyen nagyobb!" : "Legyen kisebb!");
            inputNumber = scan.nextInt();
            i++;
        };
        if(inputNumber == randomNumber){
            System.out.println("Nyert!");
        } else {
            System.out.println("nem nyert");
        };
        System.out.println("i: " + i);
    }
    
}
