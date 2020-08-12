
import java.util.Arrays;


public class Minimum {
    public static void main(String[] args) {
        int [] arr = new int [20];
        for (int i = 0; i < arr.length; i++) {
            int number = (int)(Math.random()*21)+40;
            arr[i] = number;
        }
        System.out.println(Arrays.toString(arr));
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.print("min:" + min);
            System.out.println();
    }
}
