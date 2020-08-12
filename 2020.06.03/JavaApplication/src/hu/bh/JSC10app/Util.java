package hu.bh.JSC10app;

import java.util.Scanner;

public class Util {
    public static int languageSelector = 0;
    public static final int HU = 0;
    public static final int DE = 1;
    public static final int EN = 2;
    
    public static final int LANG_STRING = 0;
    public static final int MENU_STRING = 1;
    public static final int LIMIT_STRING = 4;
    public static final int ENTER_YOUR_SCORE_STRING = 8;
    public static final int SUPER_STRING = 9;
    public static final int GOOD_STRING = 10;
    public static final int COULD_BETTER_STRING = 11;
    public static final int SHOULD_LEARN_STRING = 12;
    public static final int FAILD_STRING = 13;
    public static String [] [] language =
    {
        
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

    public static int verifiedLowerUpperLimit(int lowerLimit, int upperLimit, String msg) {
        Scanner input = new Scanner(System.in);
        System.out.println(msg + "\n" + Util.language[Util.languageSelector][Util.LIMIT_STRING] + lowerLimit + ", " + upperLimit);
        boolean ok = false;
        int inputNumber;
        do {
            inputNumber = input.nextInt();
            if (inputNumber >= lowerLimit && inputNumber <= upperLimit) {
                ok = true;
            } else {
                error();
                System.out.println(msg + "\n " +Util.language[Util.languageSelector][Util.LIMIT_STRING] + lowerLimit + ", " + upperLimit);
            }
        } while (!ok);
        return inputNumber;
    }

    public static void error() {
        System.out.println("Hibás input!");
    }
    
    public static int languageSelector(){
        Scanner input = new Scanner(System.in);
        languageSelector = 0;
        boolean ok = false;
        do {
            System.out.println(language[HU][LANG_STRING] + "(1) " + 
                               language[DE][LANG_STRING] + "(2) " + 
                               language[EN][LANG_STRING] + "(3)");
            languageSelector = input.nextInt();
            if (languageSelector >= 1 && languageSelector <= 3) {
                languageSelector -= 1;
                ok = true;
            } else
                error();
        } while (!ok);
        return languageSelector;
    }
    
    public static int languageSelector2(String lang){
        if ("HU".equals(lang)) {
            return HU;
        }
        if ("DE".equals(lang)) {
            return DE;
        }
        if ("EN".equals(lang)) {
            return EN;
        }
        return HU;
    }
    
    public static int languageSelector3(String lang){
    Scanner input = new Scanner(System.in);
        String inputString;
        if ("".equals(lang)) {
            System.out.println(language[HU][LANG_STRING] + " (HU) " + 
                            language[DE][LANG_STRING] + " (DE) " + 
                            language[EN][LANG_STRING] + " (EN)");
            inputString = input.nextLine();
        } else {
            inputString = lang;
        }
        if ("HU".equals(inputString.toUpperCase())) {
            return HU;
        } 
        if ("DE".equals(inputString.toUpperCase())) {
            return DE;
        } 
        if ("EN".equals(inputString.toUpperCase())) {
           return EN; 
        }
        return languageSelector3("");
    }
    public static void main(String[] args) {
        //System.out.println(languageSelector3(""));
    }
}
