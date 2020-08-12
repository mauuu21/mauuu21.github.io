package hu.bh.JSC10app;

public class LeapYear {

    public static boolean isLeapYear(int year) {
//Szökőévek a következők: minden néggyel osztható év,
//kivéve a százzal is oszthatókat. Szökőévek viszont a 400-zal osztható évek.
//Vagyis a századfordulók évei közül csak azok szökőévek, amelyek 400-zal is oszthatók.
// year >= 1582;
        return (year >= 1582 && year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static void leapYear() {
//Scanner input = new Scanner(System.in);
//System.out.println("Add meg az évszámot!");
//int year = input.nextInt();
        int year = Util.verifiedLowerUpperLimit(-1000, 3000, "Add meg az évszámot!");
        if (isLeapYear(year)) {
            if (year == 2020) {
                System.out.println("Elmarad az Olimpia...");
            } else {
                System.out.println("És most Olimpia!");
            }
        } else {
            System.out.println("Nincs olimpia!");
        }
    }

}
