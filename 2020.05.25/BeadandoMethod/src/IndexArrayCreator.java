
import java.util.Arrays;

public class IndexArrayCreator {
    
    public static int [] fill(int [] array){
        if (array.length == 0) {
            System.out.println(Arrays.toString(array));
            return null;
        } else
            for (int i = 0; i < array.length; i++) {
                array[i] = (int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
    
    public static void main(String[] args) {
        int [] baseArray = new int [5];
        fill(baseArray);
        if (baseArray.length != 0) {
            int [] array1 = new int[baseArray[0]];
        int [] array2 = new int[baseArray[baseArray.length-1]];
       System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        }
    }
}
