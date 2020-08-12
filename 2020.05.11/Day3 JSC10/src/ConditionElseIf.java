/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author morva
 */
public class ConditionElseIf {
    public static void main(String[] args) {
        int i = 300000;
        
        if (i < 300000) {
            System.out.println("lelép");
        } else if( i == 300000){
            System.out.println("matek");            //mind a 3 lefut,de ha igazat talál nem dolgozik tovább
        }else {
            System.out.println("marad");
        };
    }
}
