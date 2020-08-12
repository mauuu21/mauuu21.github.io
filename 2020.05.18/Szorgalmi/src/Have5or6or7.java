

public class Have5or6or7 {              //String.valueOf(hanyadik elemet nézem).contains(vizsgált elem);
    public static void main(String[] args) {
        
        int counter = 0;
        for (int i = 100; i < 999; i++) {
            if (String.valueOf(i).contains("5") || String.valueOf(i).contains("6") || String.valueOf(i).contains("7")) {
                counter++;
                System.out.println(i);
            }
            }
//        String str = String.valueOf(i);     //stringre fordítom az intet ebben az esetben
//        System.out.println(str);
//        System.out.println(str.contains("5")); //nézi,hogy van-e benne a vizsgált elem
    }
}
