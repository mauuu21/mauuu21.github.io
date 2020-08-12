
package jsc10app;                   //power shell dist mappa,clean and build

import java.util.Scanner;
import java.util.Arrays;

public class JSC10App {
    
    public static byte languageNumber = 0;
    public static String [] [] language =
    {
        {},
        
        {"Magyar" ,"Lotto (1), Osztályzat (2), Szökőév (3), PerfectSzám (4) Kilépés (5)", "Hibás input!",
        "Add meg az évszámot!","határok:", "Elmarad az Olimpia...", "És most Olimpia!", "Nincs olimpia!",
        "Add meg a pontszámot!", "Szuper!","Jó eredmény.", "Lehetne jobb is.",
        "Többet kellene tanulnod!","A vizsga sikertelen.","Adjon meg egy számot: ",
        "Tökéltes Szám", "hát ez most nem az", "Viszlát!"},
        
        {"Deutch", "Lotterie (1), Kennzeichen (2), Schaltjahr (3), PerfectNummer (4), Austritt (5)", "falsche Eingabe",
        "Geben Sie das Jahr Ein!", "Grenzen:", "Die Olympischen Spiele verpassen ...",
        "Und jetzt die Olympischen Spiele!", "Keine Olympischen Spiele!",
        "Geben Sie das Ergebnis Ein!", "Super", "Gute Ergebnisse.", "Könnte besser sein.",
        "Sie sollten mehr lernen!", "Prüfung fehlgeschlagen.", "Geben Sie eine Nummer ein:",
        "Perfect Nummer", "nun, das ist es jetzt nicht", "Auf Wiedersehen!" },
        
        {"English", "Lottery (1), Classing (2), LeapYear (3), PerfectNumber (4), Quit (5)", "Invalid input!",
        "Enter the year!","Limits: ", "Missing the Olympics ...", "And now the Olympics!", "No Olympics!",
        "Enter your score!", "Super!", "Good result.", "Could be better.",
        "You should learn more!", "Exam failed.", "Enter a number:","Perfect Number", "well that's not it now", "Goodbye!"}
    };
    

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        boolean ok = false;
        System.out.println("Magyar (1), Deutch (2), Englisch (3)");
        languageNumber = input.nextByte();
        do {
            System.out.println(language[languageNumber][1]);
            int menu = input.nextInt();
            switch (menu) {
                case 1 : lottery();
                     break;
                case 2 :  grade();
                    break;
                case 3 : 
                    leapYear();
                    break;
                case 4 :
                    perfectNumb();
                    break;
                case 5 : ok = goodbye();
                    break;
                default : System.out.println(language[languageNumber][2]);
                    break;
            }
        } while (!ok);
    }
    
    public static int verifiedLowerUpperLimit(int lowerLimit, int upperLimit, String msg){
        Scanner input = new Scanner(System.in);
        System.out.println(msg + "\n" + language[languageNumber][4] + lowerLimit + ", " + upperLimit + ")");
        boolean ok = false;
        int inputNumber;
        do {
            inputNumber = input.nextInt();
            if (inputNumber >= lowerLimit && inputNumber <= upperLimit) {
                ok = true;
            } else {
                System.out.println(language[languageNumber][2]);
                System.out.println(msg + language[languageNumber][4] + lowerLimit + ", " + upperLimit + ")");
            }    
        } while (!ok);
        return inputNumber;
    }
    
    public static boolean isLeapYear(int yearCheck){
        //Szökőévek a következők: minden néggyel osztható év,
        //kivéve a százzal is oszthatókat. Szökőévek viszont a 400-zal osztható évek.
        //Vagyis a századfordulók évei közül csak azok szökőévek, amelyek 400-zal is oszthatók.
        // yearCheck >= 1582;
        return (yearCheck >= 1582 && yearCheck % 4 == 0 && yearCheck % 100 != 0) || yearCheck % 400 == 0;
    }

    public static void leapYear() {
        int year = verifiedLowerUpperLimit(-1000, 3000, language[languageNumber][3]);
        if (isLeapYear(year)) {
            if (year == 2020) {
                System.out.println(language[languageNumber][5]);
            } else {
                System.out.println(language[languageNumber][6]);
            }
        } else {
            System.out.println(language[languageNumber][7]);
        }
    }

    public static void grade() {
        int reverse = verifiedLowerUpperLimit(0, 110, language[languageNumber][8]);
        if (reverse > 100) {
            System.out.println(language[languageNumber][9]);
        } else if (reverse >= 80) {
            System.out.println(language[languageNumber][10]);
        } else if (reverse >= 60) {
            System.out.println(language[languageNumber][11]);
        } else if (reverse >= 20) {
            System.out.println(language[languageNumber][12]);
        } else if (reverse >= 0) {
            System.out.println(language[languageNumber][13]);
        } else {
            System.out.println(language[languageNumber][2]);
        }
    }

    public static void lottery() {
        int[] lottery = new int[5];
        int i = 0;
        while (i < 5) {
            int randomNumber = (int) (Math.random() * 90 + 1);
            boolean ok = true;
            for (int j = 0; j < i; j++) {
                if (lottery[j] == randomNumber) {
                    ok = false;//nem otherOk.
                }
            }
            if (ok) {
                lottery[i++] = randomNumber;
            }
        }

        Arrays.sort(lottery);
        for (int j : lottery) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static boolean goodbye() {
        System.out.println(language[languageNumber][17]);
          return true;
    }
    
    public static void perfectNumb(){
        Scanner input = new Scanner(System.in);
        System.out.println(language[languageNumber][14]);
        int number = input.nextInt();
        int value = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                value += i;
                System.out.println(value);
            }
        }
        System.out.println((value == number)? language[languageNumber][15] : language[languageNumber][16]);
    }
}
