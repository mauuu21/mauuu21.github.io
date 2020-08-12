import java.util.Scanner;


public class Round1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double numberOne, numberTwo;
        System.out.println("Please give two number");
        System.out.print("numberOne: ");
        numberOne = scan.nextDouble();
        System.out.print("numberTwo: ");
        numberTwo = scan.nextDouble();
        if(numberOne > numberTwo){
            System.out.println(-numberOne);
        };
        if(numberTwo > numberOne){
            System.out.println(-numberTwo);
        };
        if( numberOne == numberTwo){
            System.out.println("MissMatch");
        };
    }
}
