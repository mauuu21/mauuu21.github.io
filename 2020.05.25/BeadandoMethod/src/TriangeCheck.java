
public class TriangeCheck {
    
    public static void triangle(int a, int b, int c){
        System.out.println((a + b >= c && a + c >= b && b + c >= a)? "szerkezthető" : "nem szerkezthető");
    }
    
    public static void main(String[] args) {
        triangle(7,1,9);
    }
}
