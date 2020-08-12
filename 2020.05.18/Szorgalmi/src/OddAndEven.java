
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
public class OddAndEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long [] array = new long [11];
        long odd = 0;
        long even = 0;
        System.out.println("Program need 10 number!");
        for (int i = 1; i < array.length; i++) {
            System.out.println("Number " + i + ": ");
            array[i] = scan.nextLong();
        }
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 1; i < array.length; i++) {
            if(array[i] % 2 == 0){
            even = even + array[i];
            } else {
                odd = odd + array[i];
            }
        }
        System.out.println();
        System.out.println("evensum: " + even + " oddsum: " + odd);
    }
}
