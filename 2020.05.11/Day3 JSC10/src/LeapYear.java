/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author morva
 */
public class LeapYear {
    public static void main(String[] args) {
        int Year = 2024;                                 //szökő évek kezdete 1582
        if ((Year>=1582 && Year%4==0 && Year%100!=0) || Year % 400==0){
            if (Year == 2020) {
                System.out.println("Elmarad az Olimpia");
            } else{
            System.out.println("És most Olimpia");
            }
        } else {
            System.out.println("Nincs Olimpia");
        };
    }
}
