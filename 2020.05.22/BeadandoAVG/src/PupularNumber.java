import java.util.Arrays;

public class PupularNumber {
    public static void main(String[] args) {
        int [] arr = new int [20];
        for (int i = 0; i < arr.length; i++) {
            int number = (int)(Math.random()*21)+40;
            arr[i] = number;
        }
        int popular = 0;
        int  mostNumber = arr[0];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                }
                if (counter >= popular) {
                    popular = counter;
                    mostNumber = arr[i];
                    
                }
            }
            System.out.println("Number: " + arr[i] + " was " + counter + " times");
        }
        System.out.println("Most Match: " + popular + " times " + mostNumber);
    }
}
