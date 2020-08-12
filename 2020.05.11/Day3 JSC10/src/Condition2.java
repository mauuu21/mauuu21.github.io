


public class Condition2 {
    public static void main(String[] args) {
        System.out.println("_ _ _");
        System.out.println("_ _ _");            //eza sor(utasítás csak akkor legyen látható ha...
        int i = 2;
        if( i < 10){                            // ha nincs blokk akkor csak 1 utasítás fut le
            System.out.println("_ _ _");
            System.out.println("***");
        };
        System.out.println("_ _ _");                //szekvencia -- több soros utasítás van egymás után
    }
    
}
