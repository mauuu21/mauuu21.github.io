/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author morva
 */
public class RandomNumber {
    public static void main(String[] args) {
        double d = Math.random();       //0 és 1 között add egy számot
        System.out.println(d);
        System.out.println(Math.random());
        
        System.out.println((int)Math.random());     //mindig 0
        System.out.println((int)(Math.random()*10));
        System.out.println((int)(Math.random()*10));  // 0 és 10 közötti szám de 10 nem lesz soha
        System.out.println((int)(Math.random()*11));  // így már lehet 10
        System.out.println((int)(Math.random()*10)+1);    //1 és 10 között
        System.out.println((int)(Math.random()*100)+1);     // 1 és 100 között
        System.out.println((int)(Math.random()*101)-50);        //-50 és 50 között
    }
}
