
public class Min {
    public static void main(String[] args) {
        
        int i1;
        Integer i2 = Integer.MAX_VALUE;  //objektum lekérdezése mekkora lehet a legnagyobb értéke
        System.out.println(i2);
        
        int [] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*101);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){       //eldöntés
                min = arr[i];
            }
        }
        System.out.println("Min: " + min);
    }
}
