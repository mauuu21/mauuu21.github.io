
public class PerfectNumber {
    
    public static void perfectNumb(int number){
        int value = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                value += i;
                System.out.println(value);
            }
        }
        System.out.println((value == number)? "Tökéltes Szám" : "hát ez most nem az");
    }
    
    public static void main(String[] args) {
        perfectNumb(6);
    }
}
