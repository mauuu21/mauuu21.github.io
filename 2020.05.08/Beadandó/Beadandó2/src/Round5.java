
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
public class Round5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.print("insert a number: ");
        number = scan.nextInt();
        if (100 < number) {
            System.out.println("Szuper");
        };
        if (100 >= number && 80 < number) {
                System.out.println("Jó eredmény");
        };
        if (60 < number && number <= 80) {
            System.out.println("Lehetne jobb is");
        };
        if (20 < number && number <= 60){
            System.out.println(" Többet kellene tanulnod");
        };
        if (number <= 20) {
            System.out.println(" A vizsga sikertelen");
        };
                
    }
}
