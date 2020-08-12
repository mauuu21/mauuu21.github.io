
package jsc03_5_jumping;

import java.util.Scanner;

public class MineGame {

    public static final int row = 10;
    public static final int column = 10;
    public static int[][] stage = new int[row][column];
    public static int numberOfGifts = 0;
    
    public static void bombsOnField(){
        //2. 15 bomba elhelyezése
        for (int i = 0; i < 15; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);
            
            stage[x][y] = -1;
        }
    }
    
    public static void giftsOnField(){
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
    }
    public static void giftsCounter(){
    //5. ajándékok megszámlálása
        for (int i = 0; i < stage.length; i++) {
            for (int j = 0; j < stage[i].length; j++) {
                if (stage[i][j] == 1) {
                    numberOfGifts++;
                }
            }
        }
    }
    
    public static void game(){
        
        //6. játék
        boolean bomb = false;
        Scanner scanner = new Scanner(System.in);
        int playerX = 0;
        int playerY = 0;
        
        while ( ! bomb && numberOfGifts > 0) {
            System.out.println("Adjon meg egy x és y koordinátát: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            switch (stage[x][y]) {
                case 0 :
                    stage[x][y] = 0;
                    stage[playerX][playerY] = 6;
                    break;
                case -1 :
                    bomb = true;
                    stage[x][y] = 5;
                    stage [playerX][playerY] = 0;
                    System.out.println("BOOM!!!" + "\n" + "GAME OVER");
                    break;
                case 1 :
                    stage[x][y] = 6;
                    stage[playerX][playerY] = 0;
                    numberOfGifts--;
                    playerX = x;
                    playerY = y;
                    System.out.println("GIFT!!!" + "\n" +("Gift Remain: " + numberOfGifts));
                    break;
            }
            if (numberOfGifts == 0) {
                System.out.println("Well Done! You finish the GAME!!!");
            }
            
            System.out.println("Pálya:");
            
            for (int i = 0; i < stage.length; i++) {
                for (int j = 0; j < stage[i].length; j++) {
                    if (stage[i][j] == -1) 
                        System.out.print("\033[0;31m" + "\uD83D\uDCA3" + "  ");
                     else if (stage[i][j] == 0)
                        System.out.print("\033[0;32m" + "O  ");
                    else if (stage[i][j] == 6)
                        System.out.print("\033[0;35m" + "\u263A" + "  ");
                    else if (stage[i][j] == 1)
                        System.out.print("\033[0;33m" + "\u2606"+ "  ");
                    else if (stage[i][j] == 5)
                        System.out.println("\033[0;31m" + "\uD83D\uDD25");
                    
                }
                System.out.println("");
            }
        }
    }
   
    public static void main(String[] args) {
        bombsOnField();
        giftsOnField();
        giftsCounter();
        game();
    }
    
}
