
package hu.bh.JSC10app;

public class Main {
    
    public static void main(String[] args) {
        if (args.length > 0) {
            Util.languageSelector = Util.languageSelector3(args[0]);
        } else {
            Util.languageSelector = Util.languageSelector3("");
        }
//        System.out.println(args[1]);
//        System.out.println(args[2]);
//        int i = Integer.parseInt(args[2]);
//        System.out.println(i + 10);
        App.menu();
    }
}
