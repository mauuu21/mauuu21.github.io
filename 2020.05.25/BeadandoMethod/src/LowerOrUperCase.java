
public class LowerOrUperCase {
    
    public static char input(char a){
        if (Character.isLowerCase(a)) {
            for (char i = 'a'; i < 'z'; i++) {
                if (a == i) 
                  a = Character.toUpperCase(++i);
            }
        } else
            a = '0';
        System.out.println(a);
        return a;
    }
    
    public static void main(String[] args) {
    input('g');
    }
}

