
package hu.bh.JSC10app;

import java.util.Scanner;

public class App {
    
    public static void menu() {
        Scanner input = new Scanner(System.in);
        boolean ok = false;
        //Util.languageSelector();
        do {
            System.out.println(Util.language[Util.languageSelector][1]);
            int menu = input.nextInt();
            switch (menu) {
                case 1 : Lottery.lottery();         //osztály név.metódus név
                     break;
                case 2 :  Grade.grade();
                    break;
                case 3 : LeapYear.leapYear();
                    break;
                case 4 : PerfectNumber.perfectNumb();
                    break;
                case 5 : ok = goodbye();
                    break;
                default : Util.error();
                    break;
            }
        } while (!ok);
    }
    
    public static boolean goodbye() {
        System.out.println(Util.language[Util.languageSelector][17]);
          return true;
    }
    
}
