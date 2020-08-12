/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author morva
 */
public class ConditionLastPart {
    public static void main(String[] args) {
        int i = 10;
        
        if (i >= 1 && i <= 10) {        
            System.out.println("Ok ez a szám ok");
        } else {
            System.out.println("Nem ok..");
        };
                //logikai ÉS táblázat
        System.out.println("true && true:" + (true && true));
        System.out.println("true && false:" + (true && false));
        System.out.println("false && true:" + (false && true));
        System.out.println("false && false:" + (false && false));
        
        i = -1; // meg nagyobb mint 23
        if (i < 0 || i > 23) {
            System.out.println("Yes");
        } else {
            System.out.println("Nope");
        };
        
                //Logikai VAGY táblázat
        System.out.println("true || true:" + (true || true));
        System.out.println("true || false:" + (true || false));
        System.out.println("false || true:" + (false || true));
        System.out.println("false || false:" + (false || false));
        
        
    }
}
