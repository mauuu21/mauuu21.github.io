import java.util.Arrays;
import java.util.Scanner;

public class Szoras {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Give 15 number");
        int [] array = new int [15];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + ". Number: ");
            int number = scan.nextInt();
            array[i] = number; 
            sum += array[i];
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        
        double avg = (double) sum / array.length;
        double [] szoras = new double [15];
        for (int i = 0; i < array.length; i++) {
            szoras[i] = array[i] / avg;
        }
        System.out.println(Arrays.toString(szoras));
        double szorasvalue = 0;
        for (int i = 0; i < szoras.length; i++) {
            szoras[i] = Math.pow(szoras[i], 2);
            szorasvalue += szoras[i];
        }
        System.out.print("Szórás: " + Math.sqrt(szorasvalue));
        System.out.println();
    }
}
