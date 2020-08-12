
import sun.swing.SwingUtilities2;


public class CubePoker2 {
    
    public static int [] rollEpisode = new int[13];
    
    public static void rolls(){
        for (int i = 0; i < 50; i++) {
            rollEpisode[roll() + roll()]++;
        }
    }
    
    public static int roll(){
        return (int)(Math.random()*6)+1;
    }
    
    public static void printEpisode(){
        for (int i = 2; i < rollEpisode.length; i++) {
            System.out.println(i + " volt " + rollEpisode[i] + " db.");
        }
    }

    public static void drawHorizontalDiagram(){
        for (int i = 2; i < rollEpisode.length; i++) {     //grafikon
            for (int j = 0; j < rollEpisode[i]; j++) {
                System.out.print("*");
            }
            System.out.println();  
        }
    }
    
    public static int maxEpisode(){
        int max = rollEpisode[2];
        for (int i = 2; i < rollEpisode.length; i++) {
            if (rollEpisode[i] > max) {
               max = rollEpisode[i]; 
            }
        }
        return max;
    }
    
    public static void drewVerticalDiagram(){
        for (int row = maxEpisode(); row > 0; row--) {
            for (int Episode = 2; Episode < rollEpisode.length; Episode++) {
                if(rollEpisode[Episode] < row){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
    
    
    public static void main(String[] args) {
        rolls();
        System.out.println("----------------------------------------");
        printEpisode();
        System.out.println("----------------------------------------");
        drawHorizontalDiagram();
        System.out.println("----------------------------------------");
        drewVerticalDiagram();
        
    }
}
