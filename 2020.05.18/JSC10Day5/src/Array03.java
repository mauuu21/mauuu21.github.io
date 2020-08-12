/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author morva
 */
public class Array03 {
    public static void main(String[] args) {
        int [] arr = {4, 6, 8, 9, 1, 3, 5, 6};
        String [] months = {"Januar", "Februar"};
        
      final double PI = 3.14;   //konstans: csak nagybetűvel írjuk + azaz fix,final- nem változtatható
      
      char [] str1 = {'a', 'l', 'm', 'a', 'f', 'a' };
      String str2 = "almafa";
      
        for (int i = 0; i <str1.length; i++) {
            System.out.print(str1[i] +", ");
        }
        System.out.println();
        for (int i = 0; i < str2.length(); i++) {
            System.out.print(str2.charAt(i) + ", ");        //charAt() => String karaktereit számolja
        }
        System.out.println();
        String name = "6ix9ine";
        boolean ok = true;
        for (int i = 0; i < name.length(); i++) {       //vizsgálat tartalmaz-e számot a név
            if (Character.isDigit(name.charAt(i))) {
                System.out.println("Nem jó név");
                ok = false;
            }
        }
        System.out.println(ok);
        System.out.println(str2.substring(4));      //levágja a stringet a megadott számtól( nem az indextől)
        System.out.println(str2.indexOf('a'));      //megnézi hagyadik indexen van
        
    } 
}
