/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author morva
 */
public class Switch {                           //szelekció ez is mint az if,de minta illesztés a jobb megnevezés
    public static void main(String[] args) {
        int i = 135;
        long l = 1;
        short s = 23;
        char c = 's';       //String csak Java7-estől létezik switchbe
        switch (i){
            case 1: System.out.println("Tél.");
            case 2: System.out.println("Tél."); break;
            case 3: System.out.println("Tavasz."); break;
            case 4: System.out.println("");
            case 5: System.out.println("");
            case 6: System.out.println("");
            case 7: System.out.println("");
            case 8: System.out.println("Nyár."); break;
            case 9: System.out.println("");
            case 10: System.out.println("Ősz."); break;
            case 11: System.out.println("");
            case 12: System.out.println("Tél."); break;
            default: System.out.println("Hibás input..."); break;
        };
    }
    
}
