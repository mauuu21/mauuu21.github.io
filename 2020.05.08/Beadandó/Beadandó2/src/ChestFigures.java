/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author morva
 */
public class ChestFigures {
    public static void main(String[] args) {
        String knight, king;
        char symbol = '"';              //Alt Gr + Q-ba beleköt consolra kiírásnál...
        knight = "\u265E ";
        king = "\u265A ";
        System.out.println(symbol + knight + symbol);
        System.out.println(king);
    }
}
