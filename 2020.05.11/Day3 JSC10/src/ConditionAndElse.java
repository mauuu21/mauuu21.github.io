import java.util.Scanner;


public class ConditionAndElse {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("i:?");
        int i = userInput.nextInt();
        if(i >= 0){
            System.out.println("Köszönöm megfelelő input");
        } else {
            System.out.println("Nem jó szám...");
        };
//        System.out.println("Please add a number: ");
//
//        if (new Scanner(System.in).nextInt() >= 0){
//        System.out.println("Ez a szam OK! ");
//        }  else {
//        System.out.println("Ez NEM OK :) ");
    }
}
