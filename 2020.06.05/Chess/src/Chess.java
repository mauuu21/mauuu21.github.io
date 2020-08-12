
public class Chess {

  public static final char WHITE_KING = '\u2654';
  public static final char BLACK_KING = '\u265A';
  public static final char WHITE_QUEEN = '\u2655';
  public static final char BLACK_QUEEN = '\u265B';

  public static final char WHITE_ROOK = '\u2656';
  public static final char BLACK_ROOK = '\u265C';
  public static final char WHITE_KNIGHT = '\u2658';
  public static final char BLACK_KNIGHT = '\u265E';
  public static final char WHITE_BISHOP = '\u2657';
  public static final char BLACK_BISHOP = '\u265D';

  public static final char WHITE_PAWN = '\u2659';
  public static final char BLACK_PAWN = '\u265F';

  public static char[][] board = new char[9][9];

  public static final char[] WHITE_FIGURES = {WHITE_PAWN, WHITE_ROOK, WHITE_KNIGHT, WHITE_BISHOP, WHITE_QUEEN, WHITE_KING};
  public static final char[] BLACK_FIGURES = {BLACK_PAWN, BLACK_ROOK, BLACK_KNIGHT, BLACK_BISHOP, BLACK_QUEEN, BLACK_KING};

  public static char[] wfq = {' ', WHITE_PAWN, WHITE_PAWN, WHITE_PAWN, WHITE_PAWN, WHITE_PAWN, WHITE_PAWN, WHITE_PAWN, WHITE_PAWN,};
  public static char[] bfq = {' ', BLACK_PAWN, BLACK_PAWN, BLACK_PAWN, BLACK_PAWN, BLACK_PAWN, BLACK_PAWN, BLACK_PAWN, BLACK_PAWN,};

  public static char[] wrq = {' ', WHITE_ROOK, WHITE_KNIGHT, WHITE_BISHOP, WHITE_KING, WHITE_QUEEN, WHITE_BISHOP, WHITE_KNIGHT, WHITE_ROOK,};
  public static char[] brq = {' ', BLACK_ROOK, BLACK_KNIGHT, BLACK_BISHOP, BLACK_KING, BLACK_QUEEN,  BLACK_BISHOP, BLACK_KNIGHT, BLACK_ROOK,};

  public static void init() {
    
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        board[i][j] = '\u0020';
      }
    }
    board[1] = wrq;
    board[2] = wfq;
    board[7] = bfq;
    board[8] = brq;
  }

//  public static void main(String[] args) {
//    //ChessBoardPrinter.printBoard();
//    System.out.println((int) 'a');//-96
//    for (char k = '1'; k <= '8'; k++) {
//      System.out.println((int) k);
//    }
//  }

  public static boolean move(int player_flag, int from_row, int from_column, int to_row, int to_column) {
    char figure = board[from_row][from_column];
    if (isValidFigure(player_flag, figure) &&
      checkRule(figure, from_row, from_column, to_row, to_column)){
      board[from_row][from_column] = ' ';
      board[to_row][to_column] = figure;
      return true;
      
    }
    return false;
  }

  public static boolean isValidFigure(int player_flag, char figure) {
    if (figure == ' ') {
      return false;
    }
    int i = 0;
    if (player_flag == 0) {
      while (i < WHITE_FIGURES.length && figure != WHITE_FIGURES[i]) {
        i++;
      }
    } else {
      while (i < BLACK_FIGURES.length && figure != BLACK_FIGURES[i]) {
        i++;
      }
    }
    return (i < BLACK_FIGURES.length);//? true : false;         //-1 a kereső függvényben ha false
  }

  public static boolean checkRule(char figure, int from_row, int from_column, int to_row, int to_column) {
    if (figure == BLACK_BISHOP || figure == WHITE_BISHOP){      //if feltétel lépés szabályok szerkeztés
      return checkBishopRule(from_row, from_column, to_row, to_column);
    }
    return true;            //azért kell a return true,mert e-nélkül nem tudsz csak a bishoppal lépni 
  }

  private static boolean checkBishopRule(int from_row, int from_column, int to_row, int to_column) {
    //Irányvektor v(1, 1)
    int v1 = 1, v2 = 1;
    //Irányvektor z(1, -1)
    int z1 = 1, z2 = -1;
    // Pont p(x0, y0) azaz (from_row, from_column) 
    int x0 = from_row, y0 = from_column;
    // pont p1(x, y) azaz (to_row, to_column)
    int x = to_row, y = to_column;
    //Egyenes egyenlete
    // v2 x - v1 y = v2x0 - v1y0 a jobb oldal legyen c = v2x0 - v1y0
    int c1 = (v2 * x0) - (v1 * y0); //A v irányvektorra
    System.out.println("c1: "+c1);
    System.out.println((v2 * x) - (v1 * y));
    //Rajta van-e a p1(to_row, to_column) b2 b4
    
    if (c1 == (v2 * x) - (v1 * y)){
      return true;
    }
    int c2 = (z2 * x0) - (z1 * y0); //A z irányvektorra
    System.out.println("c2: "+c2);
    System.out.println((z2 * x) - (z1 * y));
    //Rajta van-e a p1(to_row, to_column)
    if (c2 == (z2 * x) - (z1 * y)){
      return true;
    }
    return false;
  }
  
//  public static void main(String[] args) {
//    System.out.println(checkBishopRule(1, 3, 3, 1));
//  }
}
