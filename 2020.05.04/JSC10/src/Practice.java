
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


public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int alap, kitevo;
        System.out.println("Add meg az alapot");
        alap = scan.nextInt();
        System.out.println("Add meg a kitevőt");
        kitevo = scan.nextInt();
        double a = Math.pow(alap, kitevo);
      //  long a = (long) Math.pow(alap, kitevo);
        System.out.println("Az eredmény: " + a);
    }
    
}
