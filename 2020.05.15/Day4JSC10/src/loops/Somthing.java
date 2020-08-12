/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

/**
 *
 * @author morva
 */
public class Somthing {
    public static void main(String[] args) {
        System.out.print("     ");
        for (int i = 1; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int i = 1; i < 10; i++) {
            System.out.print("i: " + i + " ");
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
    
}
