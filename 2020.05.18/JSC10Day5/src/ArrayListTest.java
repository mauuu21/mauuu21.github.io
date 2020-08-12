
import java.util.ArrayList;                                     //így hívod meg

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();        //dinamikus tömb
        
        System.out.println(lines.size());               //kiírod mennyi eleme van
        lines.add("almafa");                            //hozzáadsz elemet
        lines.add("alma");
        System.out.println(lines.size());
        System.out.println(lines.get(0));               //kiírja azon az indexen lévőt
        System.out.println(lines.remove(1));            //kiveszi azon az indexen lévőt
        System.out.println(lines.size());
        
        
    }
}
