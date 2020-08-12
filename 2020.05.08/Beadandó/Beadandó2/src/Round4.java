
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
public class Round4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long number;
        System.out.println("Please give a number");
        System.out.print("number: ");
        number = scan.nextLong();
        if(number % 2 ==0){
            System.out.println("páros");
        }else{
            System.out.println("páratlan");
        };
    }
    
}
