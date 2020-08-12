/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import java.util.Scanner;

public class Szamlalo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for(int i = 1; i < 9; i++){
          //  System.out.println("*");
          //System.out.println(input.nextInt());
            System.out.print(i + " ");
        };
        System.out.println();
        
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        };
        System.out.println("");
        
        
        for (char c = 'A'; c < 'z'; c++) {
            System.out.print(c + " ");
            
        }
        System.out.println("");
    }
}
