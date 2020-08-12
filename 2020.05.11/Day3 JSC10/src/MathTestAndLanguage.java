import java.util.Scanner;
import java.util.Locale;


public class MathTestAndLanguage {
    public static void main(String[] args) {
        System.out.println(Math.ceil(32));
        
        double d = Math.ceil(9);
        
        int a = Math.abs(-34);
        
//**********************************************************
Locale currentLocale = Locale.getDefault();

System.out.println(currentLocale.getDisplayLanguage());
System.out.println(currentLocale.getDisplayCountry());

System.out.println(currentLocale.getLanguage());
System.out.println(currentLocale.getCountry());

System.out.println(System.getProperty("user.country"));
System.out.println(System.getProperty("user.language"));
// System.setProperty("user.language", "en");
// System.out.println("***");
// System.out.println(System.getProperty("user.language"));
Scanner sc = new Scanner(System.in);
sc.useLocale(Locale.ENGLISH);
System.out.println(sc.nextDouble());
            }
    
}
            //nyelvi átállítás