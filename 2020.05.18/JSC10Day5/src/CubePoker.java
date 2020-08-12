
public class CubePoker {
    public static void main(String[] args) {
        int [] roll = new int[13];  //0-t nem tudsz dobni, meg 1-et se!!!
        for (int i = 0; i < 50; i++) {
            //System.out.println(i + ". dobás:");
            //System.out.println((int)(Math.random()*6)+1);
            //System.out.println((int)(Math.random()*6)+1);
            int cube1 = ((int)(Math.random()*6)+1);
            int cube2 = ((int)(Math.random()*6)+1);
//            if (cube1 + cube2 == 2){
//               ketto++; 
//            } else if (cube1 + cube2 ==3){
//                harom++;
//            } else if (cube1 + cube2 ==4){
//                negy++;
//            }
//            System.out.println("_ _ _ _ _");
            roll[cube1 + cube2]++;  
        }
        for (int i = 2; i < roll.length; i++) {
            System.out.println(i + " volt " + roll[i] + " db.");
        }
        System.out.println("----------------------------------------");
        for (int i = 2; i < roll.length; i++) {     //grafikon
            for (int j = 0; j < roll[i]; j++) {
                System.out.print("*");
            }
            System.out.println();  
        }

        int max = roll[2];
        for (int i = 2; i < roll.length; i++) {
            if (roll[i] > max) {
               max = roll[i]; 
            }
        }
        System.out.println("max:" + max);
        
        for (int i = max; i > 0; i--) {
            for (int j = 2; j < roll.length; j++) {
                if(roll[j] < i){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
