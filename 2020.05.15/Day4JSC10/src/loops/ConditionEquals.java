/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import java.util.Scanner;


public class ConditionEquals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println(input.nextLine());
        String inputLine = input.nextLine();
//        System.out.println("".equals(inputLine));
//        char c = inputLine.charAt(2);
//        System.out.println(inputLine.charAt(2));        //vissza adja hanyadik karakter
//        System.out.println(inputLine.substring(1));     //levágja a stringet az az index előtt
//        System.out.println("alma".substring(1));
        inputLine = null;
        inputLine = input.nextLine();
        if("Mars".equals(inputLine)){
            System.out.println("Igen Mars!");
        }
//        if (inputLine.equals("Mars")) {
//            System.out.println("Igen Mars!!");
//        }
        
    }
    
}
