
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author morva
 */
public class Condition {
    public static void main(String[] args) {
        Scanner stdInput = new Scanner(System.in);
        System.out.println("i:?");
       // int i = stdInput.nextInt();
       boolean ok = false;
       String inputLine = stdInput.nextLine();
        if(inputLine.equals("y")){          //.equals olyan mint az == üsszehasonlítás
            ok = true;
            System.out.println("JSC10");
        };
        System.out.println("ok:" + ok);
    }
    
}
