
import java.util.Scanner;


public class Triangle {
    
    public static double read(char c){
        Scanner input = new Scanner(System.in);
        double d;
        boolean ok = false;
        do {
            System.out.println(c + "?");
            d = input.nextDouble();
            if (d > 0)
                ok = true;
            else
                System.out.println("Hibás input!");
        } while (!ok);
        return d;
}
//    public static double area(){
//    
//    }
    
    public static void main(String[] args) {
        //vizsgálni,hogy megszerkeztethető-e
        double a = read('a');
        double b = read('b');
        double c = read('c');
        
        double k = a + b + c;
        double s = k / 2.0;
        
        System.out.println(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
        
        //System.out.println(area());
    }
}
