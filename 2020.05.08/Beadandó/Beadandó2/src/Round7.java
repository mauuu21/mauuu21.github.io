
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
public class Round7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please give a number 1 till 5");
        System.out.print("Your number: ");
        int number = scan.nextInt();
        if (number == 1 || number == 2 || number == 3) {
            System.out.println("Megbukott");
        }else if (number == 4 || number == 5){
            System.out.println("Megfelelt");
        }else{
            System.out.println("Ooops, somthing wrong, try agein please!");
        };
        System.out.println("***********************************************");
        switch(number){
            case 1 : 
            case 2 :
            case 3 : System.out.println("Megbukott");
            break;
            case 4 : 
            case 5 : System.out.println("Megfelelt");
            break;
            default : System.out.println("Ooops, somthing wrong, try agein please!");
            break;
        };
    }
}
