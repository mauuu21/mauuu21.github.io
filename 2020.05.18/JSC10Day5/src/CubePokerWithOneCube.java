/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author morva
 */
public class CubePokerWithOneCube {
    public static void main(String[] args) {
        int[] roll = new int[7]; //roll [0] nem használt!
        for (int i = 0; i < 100; i++) {
            int cube = (int)(Math.random()*6)+1;    //1-6
            roll [cube]++;
        }
        for (int i = 1; i < roll.length; i++) {
            System.out.println(i + ". dobás volt: " + roll[i] + "db.");
        }
    }
}
