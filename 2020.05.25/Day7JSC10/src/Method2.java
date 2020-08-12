
import java.util.Arrays;


public class Method2 {
    
    public static int a = 21;       //osztály változó
    public static int[] arr2;
    
    public static void fill(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }
    }
    
    public static void printArray(int[] a){
        System.out.print("[");
        if (a.length > 0) {
            for (int i = 0; i < a.length-1; i++) {
                System.out.print(a[i] + ", ");
            }
            System.out.print(a[a.length-1]); 
        }
        System.out.println("]");
            
    }
    
    public static int max (){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] > max){
                max = arr2[i];
            }
        }
        return max;
    }
    
    public static int max (int[] fuge){     //házi
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] > max){
                max = arr2[i];
            }
        }
        return max;
    }
    
    public static int find(int i, int[] arr){
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] == i)
                return j;
        }
        return -1;
    }
    
    public static int find(double d, double [] arr){
        int i = 0;
        while (i < arr.length && arr[i] != d){
            i++;
        }
        return (i < arr.length)? i : -1;
        
    }
    
    public static void lottery(){
        int [] lottery = new int [5];
        int i = 0;
        while(i < 5){
            int lotteryNumber = (int)(Math.random()*90+1);
            if(find(lotteryNumber, lottery) == -1){
                lottery[i++] = lotteryNumber;
            }    
        }
        printArray(lottery);
    }
    
    public static void main(String[] args) {
        int [] arr = new int [10];
        fill(arr);
        printArray(arr);
        System.out.println(Arrays.toString(arr));
        Method2.fill(arr);
        arr2 = new int [25];
        Method2.fill(arr2);
        printArray(arr2);
        arr2 [9] = -23;
        System.out.println(find(-23, arr2));
        lottery();
        double [] dArr = {3.5, 6.7, 8.2};
        System.out.println(find(6.7,dArr));
        int i = find(67, arr2);
        if (i == -1) {
            System.out.println("Nincs találat");
        }
        System.out.println("alma".indexOf('w'));
    }
}
