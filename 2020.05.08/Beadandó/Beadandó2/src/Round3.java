import java.util.Scanner;


public class Round3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long number;
         System.out.println("please insert a number from 0 or bigger");
         System.out.print("number: ");
        number = scan.nextLong();
        if (number < 0){
            System.out.println("Give one which 0 or bigger");
        }
        if(number % 3 == 0 && number % 5 ==0){
            System.out.println("Luss");
        }else if (number % 3 == 0) {
            System.out.println("Buzz");
        }else if (number % 5 == 0){
            System.out.println("Fizz");
        };
        
    }
     
}
