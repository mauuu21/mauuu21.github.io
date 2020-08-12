
package hu.bh.JSC10app;

import java.util.Scanner;

public class PerfectNumber {
    
    public static void perfectNumb(){
        Scanner input = new Scanner(System.in);
        System.out.println(Util.language[0][14]);
        int number = input.nextInt();
        int value = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                value += i;
                System.out.println(value);
            }
        }
        System.out.println((value == number)? Util.language[0][15] : Util.language[0][16]);
    }
    
}
