import java.util.Arrays;
import java.util.Scanner;

public class ArrayAtlagSzorasMaximum {
    
    public static void fill(int[] array){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + ". Number:");
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
    
    public static void max(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max: " + max);
    }
    
    public static double avarage (int [] arrAvarage){
    int sum = 0;
        for (int i = 0; i < arrAvarage.length; i++) {
            sum += arrAvarage[i];
        }
        System.out.println(sum);
        System.out.println("Avg: " + (double)sum / arrAvarage.length);
        return sum;
    }
    
    public static double szoras(int [] arrSzoras, double sum){
        double avg = sum / arrSzoras.length;
        double [] szoras = new double [arrSzoras.length];
        for (int i = 0; i < arrSzoras.length; i++) {
            szoras[i] = avg - arrSzoras[i];
        }
        double szorasValue = 0;
        for (int i = 0; i < szoras.length; i++) {
            szoras[i] = Math.pow(szoras[i], 2);
            szorasValue += szoras[i];
        }
        szorasValue = Math.sqrt(szorasValue);
        System.out.print("Szórás: " + szorasValue);
        System.out.println();
        return szorasValue;
        
    }
    
    public static void main(String[] args) {
        int [] arr = new int [15];
        fill(arr);
        System.out.println("********************");
        max(arr);
        System.out.println("********************");
        avarage(arr);
        System.out.println("********************");
        szoras(arr,avarage(arr));
    }
}
