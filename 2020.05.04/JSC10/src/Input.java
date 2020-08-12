/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author morva
 */
import java.util.Scanner;           //osztály elején meg kell adni a scanner-t
        
public class Input {
    public static void main(String[] args) {
        int i;     //input
        Scanner sc = new Scanner(System.in);        //1x deklaráltam többször nem kell;
        System.out.println("i?");
       i = sc.nextInt();
        System.out.println("i: " + i);
        System.out.println("f?");
        int f = sc.nextInt();
        System.out.println("f: " + f);
        
    }
}
