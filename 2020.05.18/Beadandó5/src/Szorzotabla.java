
import java.util.Arrays;
import java.util.Scanner;


public class Szorzotabla {
    
    public static byte read(){
    Scanner scan = new Scanner(System.in);
        byte number;
        boolean ok = false;
        do {
            System.out.println("Give a number from 9 till 24");
            number = scan.nextByte();
            if (number < 9 || number > 24) {
                System.out.println("Wrong Input!");
            } else {
                ok = true;
            }
        } while (!ok);
        return number;
    }
    
    public static void print(byte number){
        byte [] array = new byte [6];
        for (byte i = 1; i < array.length; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
            array[i] = (byte) (number * i);
        }
        System.out.println(Arrays.toString(array));
    }
    
    public static void main(String[] args) {
        print(read());
    }
}
