
import java.util.Scanner;


public class Lottery {
    public static void main(String[] args) {
        int [] winArray = new int [5];
        int [] yourNumb = new int [5];
        int counter = 0;
        int countOfNumbs = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Lottery! Give 5 numbers from 1. till 90. and we gonna check it!");
        for (int i = 0; i < winArray.length; ++i) {
            System.out.println("Number: ");
            int numbers = scan.nextByte();
            yourNumb[i] = numbers;
        }
        System.out.println();
        while(countOfNumbs < 5){
            int randomNumb = (int)(Math.random()*90)+1;
            boolean correct = false;
            for (int i = 0; i < countOfNumbs; i++) {
                    if (winArray[i] == randomNumb) {
                        correct = true;
                    }
            }
            if(correct == false){
                    winArray[countOfNumbs] = randomNumb;
                    countOfNumbs++;
            }
        }
        System.out.println("Winner numbers: ");
            for (int i = 0; i < winArray.length; i++) {
                System.out.print(winArray[i] + ". ");
            }
            System.out.println();
            int tester = 0;
            while (tester < 5) {
                for (int i = 0; i < winArray.length; i++) {
                    if(yourNumb[tester] == winArray[i]){
                        counter++;
                        System.out.println(counter + ". Talált! : " + winArray[i]);
                    }
                }
                tester++;
            }
            System.out.println();
            System.out.println(counter + ". Találatod van!");
    }
}
