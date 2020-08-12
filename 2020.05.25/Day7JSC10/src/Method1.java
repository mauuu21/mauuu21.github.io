
import java.util.Scanner;

public class Method1 {
    
    public static void printStar(){     //a fehér a metódus azonosítója,kisbetűvel kezd és CAMELCASE
        System.out.print("*");
        System.out.print("#");
        System.out.println("*");
    }
    public static void printChar(char c) {
        for (int i = 0; i < 10; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
    
    public static double read(){
       Scanner input = new Scanner(System.in);
       double d;
       boolean ok = false;
       do {
          d = input.nextDouble();
          if(d > 0)
              ok = true;
          else
               System.out.println("Hibás input");
       } while (!ok);
        
       return d; 
    }
    
    public static void main(String[] args) {
        printStar();        //ha classon belül van
        //itt van a meló
        printStar();
        Method1.printStar();    //ha nincs a classban
        printChar('a');
        char ch = 'f';
        printChar(ch);
        double d = read();
        System.out.println(read());
//        System.out.println(d);
//        read();                 //így is meg lehet hívni
        
        byte a = 9;
    }
 
}
