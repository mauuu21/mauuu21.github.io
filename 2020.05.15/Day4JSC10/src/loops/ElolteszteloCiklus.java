/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import java.util.Scanner;

/**
 *
 * @author morva
 */
public class ElolteszteloCiklus {
    public static void main(String[] args) {
        //szám beolvasása osztható 15-el(  x %15 ==0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Szám?");
        int input = scan.nextInt();
        int i = 1;
        while(input % 15 != 0){
            System.out.println("Szám?");
            input = scan.nextInt();
            i++;
        }
        System.out.println("beolvasott szám:"  + input);
        System.out.println("olvasások száma: " + i);
    }
    
}
