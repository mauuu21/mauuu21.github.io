
import java.util.Arrays;


public class TestForEach {
    public static void main(String[] args) {
        
        int [] arr = new int [10];
        
        for (int elem : arr) {                          //másolatot csinál csak,nem magát a tömböt
            elem = (int)(Math.random()*51+50);
            System.out.print(elem + " ");
        }
        System.out.println();
        
        System.out.println(Arrays.toString(arr));
    }
}
