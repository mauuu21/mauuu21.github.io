/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import java.util.Scanner;


public class HatuleszteloCiklus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputNumber;
        boolean ok = false;
        int i = 0;
        do {
            inputNumber = input.nextInt();
            i++;
            if (inputNumber % 15 != 0) {
                System.out.println("Nem jó szám!");
            } else {
                ok = true;
            }                                                      
        } while(!ok) /*(inputNumber % 15 != 0);*/ ;                         //itt 1x biztos lefut
           System.out.println("A beolvasott szám: " + inputNumber);         //ellenőrzi,hogy heyles-e az állítás
           System.out.println("i:" + i);
                                                                        
    }
    
}
