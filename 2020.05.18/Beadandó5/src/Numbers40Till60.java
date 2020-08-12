
import java.util.Arrays;


public class Numbers40Till60 {
    
    public static byte [] array;
    
    public static void fill(){
        for (int i = 0; i < array.length; i++) {
            array[i] = (byte)(Math.random()*21 + 40);
        }
    }
    
    public static byte min (){
        byte min = Byte.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) 
                min = array[i];
        }
        System.out.print("min: " + min);
        System.out.println();
        return min;
    }
    
    public static void fiftyFive (){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 55)
                System.out.println("Have " + array[i] + " on " + i + "th Index");
        }
        System.out.println(Arrays.toString(array));
    }
    
    public static void mostMatch(){
        int popular = 0;
        int  mostNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                }
                if (counter >= popular) {
                    popular = counter;
                    mostNumber = array[i];
                }
            }
            System.out.println("Number: " + array[i] + " was " + counter + " times");
        }
        System.out.println("Most Match: " + popular + " times " + mostNumber);
    }
    
    public static void main(String[] args) {
       array = new byte [25];
       fill();
       min();
       fiftyFive();
       mostMatch();
    }
}
