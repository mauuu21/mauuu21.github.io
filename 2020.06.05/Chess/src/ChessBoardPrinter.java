
public class ChessBoardPrinter {
  
  public static void printABC(){
    System.out.println("    A    B    C    D   E    F   G    H");
  }
  
  public static void printBoard(){
    System.out.println("  ---------------------------------------");
    for (int row = 1; row <= 8; row++) {
      System.out.print(row+" ");
      for (int column = 1; column <= 8; column++) {
        
        System.out.print(Chess.board[row][column] == ' ' ?  "| " + square(row+column) + " " :
                                     "| " + Chess.board[row][column] + " ");
        //\u2B1B, \u2588, \u2591
      }
      System.out.print("|");
      System.out.println();
      System.out.println("  ---------------------------------------");
    }
    printABC();
  }

  public static char square(int i) {
    return i%2!=0? '\u2588' : '\u2591'; 
  }
  
}
