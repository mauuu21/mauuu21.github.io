
import java.util.Arrays;
import java.util.Scanner;


public class Atlag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give 15 number");
        int [] array = new int [15];
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + ". Number: ");
            int number = scan.nextInt();
            array[i] = number;  
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
        System.out.println("Avg: " + (double)sum / array.length);
    }
}
