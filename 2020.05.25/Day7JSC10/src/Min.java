
public class Min {
    
    public static int min(int a, int b){
//        if (a < b) 
//            return a;
//        return b;
          return a < b? a : b;
    }
    
    public static int min (int a, int b, int c){
        return min(a,min(b, c));
    }
    
    public static double min(double a, double b){     //Method Overloading!
    return a < b? a : b;
    }
    
    
    public static void main(String[] args) {
        System.out.println(min(4, -10));
        int a1 = 23, a2 = 98;
        System.out.println(min(a1, a2));
        int min = min(a1, a2);
        System.out.println(min(a1, 24.0));
        System.out.println(min(12, -12, 5));
        
    }
    
}
