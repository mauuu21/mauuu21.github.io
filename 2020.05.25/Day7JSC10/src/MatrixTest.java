
public class MatrixTest {
    public static void main(String[] args) {
        int [] [] arr2D = {
            {1,2},                      //0 index 0-ja az 1
            {3,4}
        };
//        System.out.println(arr2D[0][0]); // [] sor [] oszlop
//        System.out.println(arr2D.length);   // olyan hosszú mint a sorok,mert a mátrix tömbön belüli tömbök
        
        
        int [] [] matrix = new int [3] [10];     //2 sor 5 oszlop azaz a hossza 2
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = (int)(Math.random()*2);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
//        System.out.println(matrix.length);
//        System.out.println(matrix[0].length);   // egy sornak a hossza
    }
}
