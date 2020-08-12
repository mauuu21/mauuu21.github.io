
public class Calandar {
    public static void main(String[] args) {
        int [][] year = {
            {1,2,3,4,5,31},
            {1,2,3,4,28},
            {1,2,3,4,5,6,29,30,31},
            {1,2,3,4,5,29,30}
        };
        
        for (int i = 0; i < year.length; i++) {
            for (int j = 0; j < year[i].length; j++) {
                System.out.print(year [i][j] + ", ");
            }
            System.out.println();  
        }
    }
}
