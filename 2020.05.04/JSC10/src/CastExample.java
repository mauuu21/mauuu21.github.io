/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author morva
 */
public class CastExample {
    public static void main(String[] args) {
        int i = 8 / 2;
        double d = 7.0 / 2; //implicit castolás
       // d = (double) 7 / 2; //explicit castolás
        System.out.println(d);
        double s = 9.0;
        double v = 2.0;
        int e = (int) (s / v);
        System.out.println(e);
    }
}
