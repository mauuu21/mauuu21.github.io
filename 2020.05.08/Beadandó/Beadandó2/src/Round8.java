/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author morva
 */

import java.util.Scanner;

public class Round8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int random = ((int)(Math.random()*29)+10);
         System.out.println("Please insert a number from 10 till 38");
         System.out.print("Your number: ");
         int number = scan.nextInt();
         if(number == random){
             System.out.println("winner-winner, chicken dinner!");
             System.out.println(random);
         }else{
             System.out.println("Sorry, you lose :_(");
             System.out.println("Double or nothing?");
             System.out.print("Your number: ");
             number = scan.nextInt();
             if(number == random){
                 System.out.println("You lucky bastard...");
                 System.out.println(random);
             }
         }if(number != random){
             System.out.println("\uD83D\uDE08" + " HAHAHAHA! You lost everything " + "\uD83D\uDE08");
             System.out.println("winner number:" + random);
             
         };
    }
}
