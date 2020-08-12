
import java.util.Arrays;


public class Find {
    public static void main(String[] args) {
        
        int [] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*101);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
       arr [9] = 14; arr[0] = 14;
        System.out.println(Arrays.toString(arr));
        int num = 14;
        int i = -1;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] == num){
                System.out.println("Igen van...");
                i = j;
                System.out.println("j: " + j);
            }
        }
        System.out.println("index: " + i);
        
        i = 0;
        while (i < arr.length && arr[i] != num){
            i++;
        }
        i = i < arr.length? i : -1;         //-1 jelzés,hogy nincs benne előfordulás
        System.out.println("Index: " + i);
    }
}
