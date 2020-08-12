import java.util.Scanner;


public class Round2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numb1, numb2;
        System.out.println("Please give two number");
        System.out.print("numb1: ");
        numb1 = scan.nextInt();
        System.out.print("numb2: ");
        numb2 = scan.nextInt();
        if (numb1 < numb2) {
            System.out.println(Math.sqrt(numb1));
        }
        if (numb2 < numb1) {
            System.out.println(Math.sqrt(numb2));
        }
        if( numb1 < 0 || numb2 < 0) {
            System.out.println("Error");
        };
    }
    
}
