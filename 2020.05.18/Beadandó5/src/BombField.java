
public class BombField {
    public static int [] [] field;
    
    public static void field(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 14; j++) {
                field [i] [j] = (int)(Math.random()*5);
            }
        }
        
        int counter = 20;
        for (int[] places : field) {
            for (int i = 0; i < field.length; i++) {
                if (places[i] == 1 && counter > 0) {
                    System.out.print("\033[0;31m" + "\uD83D\uDCA3");
                    counter--;
                } else {
                    System.out.print("\033[0;32m" + "O ");
                }
            }
        System.out.println();
        }
    }
      
    public static void main(String[] args) {
        field = new int [10] [14];
        field();
    }
}
