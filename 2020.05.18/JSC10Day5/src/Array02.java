/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author morva
 */
public class Array02 {
    public static void main(String[] args) {
        int [] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length-1]);
        System.out.println();
        
        int [] triangle = new int[3];
        int [] lotto = new int[5];
    }
}
