
import java.util.Arrays;


public class Sort {
    public static void main(String[] args) {
        
       int [] arr = {5, 9, -1, 3, -23, 120, 99, 4};            //inicializácós blokk {}
       
        for (int i = 0; i < arr.length; i++) {              
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        System.out.println(Arrays.toString(arr));
//        Arrays.sort(args);
    }
}
