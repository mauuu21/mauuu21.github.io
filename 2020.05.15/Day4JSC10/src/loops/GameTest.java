
package loops;

import java.util.Scanner;


public class GameTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNumber = (int)(Math.random()*16);
        for (int i = 0; i < 10; i++) {
            System.out.println("Tipp?");
            int inputNumber = input.nextInt();      //nem muszáj if-be áll rövidítve if (input.nextInt() == randomNumber)
            if (inputNumber == randomNumber){
                System.out.println("Yeaa");
                break;
            } else {
                System.out.println(":-(");
//                if (inputNumber < randomNumber){
//                    System.out.println("legyen nagyobb");
//                } else {
//                    System.out.println("legyen kissebb!");
//                }
           
           }
            System.out.println((inputNumber < randomNumber)? "legyen nagyobb!" : "legyen kisebb!");
        }
        
    }
}
