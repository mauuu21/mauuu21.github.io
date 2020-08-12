
import java.util.Scanner;

public class DoWhileGameTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int randomNumber = ((int)(Math.random()*15)+1);
        //System.out.println(randomNumber);
        int chance = 10;
        int input;
        System.out.println("\u2605" + "\u2606" + "\u2605" + " Game Time!! " + "\u2605" + "\u2606" + "\u2605");
        System.out.println("Give a number from 1 till 15");
        do {
            System.out.println((chance > 1)?"You have: "+ chance + " chance" : "This is your last chance");
            chance--;
            System.out.print("Your number: ");
            input = scan.nextInt();
            System.out.println((input != randomNumber)? "Nope!" + "\uD83D\uDCA9" : "Winner-winner, chicken dinner!" + "\n" + "winner number: " + randomNumber + "\uD83C\uDFC6");
            if(input < randomNumber && chance != 0) {
                System.out.println("Your Number is smaller!");
            } else if (input > randomNumber && chance != 0){
                System.out.println("Your number is bigger!");
              }
            System.out.println("");
        } while(input != randomNumber && chance != 0);
        System.out.println((chance == 0 && input != randomNumber)?"\uD83D\uDE08" + " HAHAHAHA! You lose! " + "\uD83D\uDE08" + "\n" + "winner Number was: " + randomNumber : "New Round?");
    }
}
