
public class Avg {
    public static void main(String[] args) {
        
        int [] arr = new int [100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*101);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        int sum = 0;                                                //mindig 0, Összegzés
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum: " + sum);
        System.out.println("avg: " + (double)sum/arr.length);       //átlagszámítás
        
        for (int elem : arr){                                       //ez a for each
            System.out.print(elem);
        }
    }
}
