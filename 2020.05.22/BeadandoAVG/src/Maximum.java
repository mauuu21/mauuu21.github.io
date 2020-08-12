import java.util.Arrays;
import java.util.Scanner;

public class Maximum {
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
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            System.out.println("Max: " + max);
        }
    }
}
