
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
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Prime Checker");
        System.out.println("Your Number: ");
        Long number = scan.nextLong();
        boolean prime = true;
        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                prime = false;
                System.out.print("osztható: ");
                System.out.println(i);
            }
        }
        if (prime == true && number > 0) {
            System.out.println(number + " is a Prime");
        } else {
            System.out.println(number + " is not Prime");
        }
    }
}
