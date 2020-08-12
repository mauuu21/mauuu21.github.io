
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author morva
 */
public class Round6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String planet, distance;
        distance = "Distance from the Sun:";
        System.out.println("Choose one of these: (Mars, Fold, Jupiter, Venusz)");
        System.out.print("Name your planet: ");
        planet = scan.next();
        if (planet.equals("Mars")) {
            System.out.println(distance + " 227,9 millió km");
        };
        if (planet.equals("Fold")) {
            System.out.println(distance + " 149,6 millió km");
        };
        if (planet.equals("Jupiter")) {
            System.out.println(distance + " 778,3 millió km");
        };
        if (planet.equals("Venusz")) {
            System.out.println(distance + " 108,2 millió km");
        };
        System.out.println("*************************************");
        switch(planet){
            case "Mars" : System.out.println(distance + " 227,9 millió km");
            break;
            case "Fold" : System.out.println(distance + " 149,6 millió km");
            break;
            case "Jupiter" : System.out.println(distance + " 778,3 millió km");
            break;
            case "Venusz" : System.out.println(distance + " 108,2 millió km");
            break;
            default : System.out.println("Ohh, somthing wrong! Please try agein!");
        };
    }
    
}
