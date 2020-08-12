
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
public class SmalestInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Insert your numbers");
        
        System.out.print("a:");
        a = scan.nextInt();
        System.out.print("b: ");
        b = scan.nextInt();
        System.out.print("c: ");
        c = scan.nextInt();
        if(a < b) {
            if(a < c){
                System.out.println("smallest number is a: " + a);
            };
        } else if (b < a){
                if(b < c){
                    System.out.println("smallest number is b: " + b);
                };    
        }  if(c < a){
            if(c < b){
                System.out.println("smallest number is c: " + c);
            };
        } if(a == b || a == c || b == c){
            System.out.println("give 3 different number please");
        };              
     }
}           // az utolsó if nem kell ha az if-ekben <= adok meg,de így gondoltam megoldani most
