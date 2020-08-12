import java.util.Scanner;
Scanner java.
public class RefactorCode {
    


public class JSC03_5_Jumping {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //1. pálya
        final int row = 10;
        final int column = 10;
        
        int[][] stage = new int[row][column];
        
        int numberOfGifts = 0;
        
        int playerX = 0;
        int playerY = 0;
        
        //2. 15 bomba elhelyezése
        for (int i = 0; i < 15; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);
            
            stage[x][y] = -1;
        }
        
        //3. ajándékok elhelyezése
        for (int i = 0; i < 20; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);
            
            if (stage[x][y] == -1) {
                stage[x][y] = 0;
            
            } else {
                stage[x][y] = 1;
            
            }
        }
        
        //4. 0,0-ra jákos
        stage[playerX][playerY] = 6;
        
        //5. ajándékok megszámlálása
        for (int i = 0; i < stage.length; i++) {
            for (int j = 0; j < stage[i].length; j++) {
                if (stage[i][j] == 1) {
                    numberOfGifts++;
                }
            }
        }
        
        //6. játék
        boolean bomb = false;
        Scanner scanner = new Scanner(System.in);
        
        while ( ! bomb && numberOfGifts > 0) {
            System.out.println("Adjon meg egy x és y koordinátát: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            switch (stage[x][y]) {
                case 0:
                    stage[playerX][playerY] = 0;
                    stage[x][y] = 6;
                    break;
                case -1:
                    bomb = true;
                    break;
                case 1:
                    stage[playerX][playerY] = 0;
                    stage[x][y] = 6;
                    numberOfGifts--;
                    break;
            }
            
            System.out.println("Pálya:");
            
            for (int i = 0; i < stage.length; i++) {
                for (int j = 0; j < stage[i].length; j++) {
                    System.out.print(stage[i][j] + " ");
                }
                System.out.println("");
            }
             
        }
        
    }
    
}
}
