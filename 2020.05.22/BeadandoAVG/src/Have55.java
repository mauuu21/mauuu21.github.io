import java.util.Arrays;

public class Have55 {
    public static void main(String[] args) {
        
        int [] arr = new int [20];
        for (int i = 0; i < arr.length; i++) {
            int number = (int)(Math.random()*21)+40;
            arr[i] = number;
            if (arr[i] == 55) {
                System.out.println("Have " + arr[i] + " on " + i + "th Index");
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
