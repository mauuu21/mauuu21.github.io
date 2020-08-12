/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author morva
 */
public class SquareWhile {
    public static void main(String[] args) {
        int number = 10;
        while(number <= 25){
            System.out.println(number + " Square: " + ((int)Math.pow(number, 2)));
            number++;
        }
    }
}
