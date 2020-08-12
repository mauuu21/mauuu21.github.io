/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author morva
 */
public class SquareFor {
    public static void main(String[] args) {
        for (int i = 10; i <= 25; i++) {
            System.out.print(i + " Square: ");
            System.out.println((int)Math.pow(i, 2));
        }
    }
}
