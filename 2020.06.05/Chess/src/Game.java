

import java.util.Scanner;


public class Game {
  
  public static int player_flag = 0, // 0 white, 1 black
                    from_row = 0, // A, B, C... (1-8)
                    to_row = 0, // A, B, C... (1-8)
                    from_column = 0, // 1 - 8
                    to_column = 0; // 1 - 8
  
  public static void play(){
    boolean exit = false;
    Scanner scanner = new Scanner(System.in);
    do {
      ChessBoardPrinter.printBoard();
      String inputLine = scanner.nextLine().trim();
      if ("exit".equals(inputLine)){
        exit = true;
      } else {
        if (checkInputLine(inputLine)){
          
          if (Chess.move(player_flag, from_row, from_column, to_row, to_column)){
            player_flag = player_flag == 0 ? 1 : 0;
          } else {
            System.out.println("A másik játékos lép!");
          }
        }
        System.out.println(from_row + " " + from_column + " " + to_row + " " + to_column);
      }
    } while (!exit);
  }
  
  public static boolean checkInputLine(String inputLine){
    if (null == inputLine || "".equals(inputLine)){
      System.out.println("Nem megfelelő adatbevitel.");
      return false;
    }
    if (inputLine.length() != 5){
      System.out.println("Nem megfelelő adatbevitel.");
      return false;
    }
    char[] inputChars = inputLine.toCharArray();
//    if ((inputChars[0] < 'a' || inputChars[0] > 'f') || 
//        (inputChars[1] < '1' || inputChars[1] > '8') ||
//         inputChars[2] != ' ' ||
//        (inputChars[3] < 'a' || inputChars[3] > 'f') || 
//        (inputChars[4] < '1' || inputChars[4] > '8')){

if (    !((inputChars[0] >= 'a' && inputChars[0] <= 'h') && 
        (inputChars[1] >= '1' && inputChars[1] <= '8') &&
         inputChars[2] == ' ' && 
        (inputChars[3] >= 'a' && inputChars[3] <= 'h') && 
        (inputChars[4] >= '1' && inputChars[4] <= '8'))
   ){
      System.out.println("Nem megfelelő adatbevitel.");
      return false;
    } else {
      from_column = (int)inputChars[0] - 96;
      from_row = inputChars[1] - 48;
      
      to_column = (int)inputChars[3] - 96;      //'a' char a 97 int-en,,-96 lesz az első index 
      to_row = inputChars[4] - 48;
    }
    return true;
  }
  
  public static void main(String[] args) {
     // System.out.println((int)('a'));
    Chess.init();
    play();
//      for (char c = '0'; c < 'z'; c++) {
//          System.out.println(c);
//      }
//      System.out.println((int)'1');
//    String str = "alma";
//    char [] c = str.toCharArray();
//      for (char d : c) {
//          System.out.println(d);
 //     }
  }
  
}
