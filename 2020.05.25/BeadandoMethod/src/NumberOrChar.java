
public class NumberOrChar {
    
    public static boolean isInput(char a){
        boolean ok = true;
            for (char i = 'A'; i < 'z'; i++) {
                if (a == i) 
                  ok = false;
            }
            System.out.println(ok);
        return ok;
    }
    
    public static void main(String[] args) {
        isInput('A');
    }
}
