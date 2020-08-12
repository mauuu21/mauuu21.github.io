
import java.util.Arrays;


public class Count {
    public static void main(String[] args) {
        
         int [] arr = new int [100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*101);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        int counter = 0;        //mindig 0
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println("Páros elemek száma:" + counter);
        
        int [] arr2 = new int [counter];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                arr2[j++] = arr[i];
            }
        }
        
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.print(arr2[i] + " ");
//        }
        System.out.println(Arrays.toString(arr2));
    }
}
