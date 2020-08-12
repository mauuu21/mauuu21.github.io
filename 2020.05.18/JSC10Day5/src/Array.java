
import java.util.Scanner;


public class Array {
    public static void main(String[] args) {
        int[] arr = new int [3];        //36 byte mert 9 * 4 byte, azt int 4 byte
        //System.out.println(arr[0]);     // a 0 az néha első :-)
        Scanner scanner = new Scanner(System.in);
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();
        
        for (int i = 0; i < arr.length+1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
}
