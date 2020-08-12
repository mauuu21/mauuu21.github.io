package hu.bh.JSC10app;

public class Grade {

    public static void grade() {
        int reverse = Util.verifiedLowerUpperLimit(0, 110, "Add meg a pontszámot!");
        if (reverse > 100) {
            System.out.println(Util.language[Util.languageSelector][Util.SUPER_STRING]);
        } else if (reverse >= 80) {
            System.out.println(Util.language[Util.languageSelector][Util.GOOD_STRING]);
        } else if (reverse >= 60) {
            System.out.println(Util.language[Util.languageSelector][Util.COULD_BETTER_STRING]);
        } else if (reverse >= 20) {
            System.out.println(Util.language[Util.languageSelector][Util.SHOULD_LEARN_STRING]);
        } else if (reverse >= 0) {
            System.out.println(Util.language[Util.languageSelector][Util.FAILD_STRING]);
        } else {
            System.out.println("Hibás érték!");
        }
    }
}
