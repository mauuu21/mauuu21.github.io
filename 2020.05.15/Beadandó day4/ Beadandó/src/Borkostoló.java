/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author morva
 */
import java.util.Scanner;
public class Borkostoló {
    public static void main(String[] args) {
        int lineNum;
    int age;
    String name;
    int counter=1;
    Scanner input=new Scanner(System.in);
 
    do {
    System.out.println("A jelentkező sorszáma: "+counter+".");
    System.out.println("Add meg a teljes neved, ékezetek nélkül!");
    name=input.next();
    System.out.println("Add meg az életkorod!");
    age=input.nextInt();
    System.out.println((age < 18)?"18 év alatti látogató nem vehet részt a programon!" : "Az "+counter+". jelentkező: "+name+", a kora:"+age+counter++);
    }     
    while (!"-1".equals(name));
    
    }
}
