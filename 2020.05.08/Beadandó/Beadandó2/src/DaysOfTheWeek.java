
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
public class DaysOfTheWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give a numer of the day: ");
        int day = scan.nextInt();
        switch(day){
            case 1 : System.out.println("Monday");
             break;
            case 2 : System.out.println("Tuesday");
             break;
            case 3 : System.out.println("Wednesday");
             break;
            case 4 : System.out.println("Thursday");
             break;
            case 5 : System.out.println("Friday");
             break;
            case 6 : System.out.println("Saturday");
             break;
            case 7 : System.out.println("Sunday");
             break;
            default: System.out.println("You are out of this week");
             break;
        };
        
    }
}
