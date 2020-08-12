/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author morva
 */
public class Output {
    public static void main(String[] args) {
        int i = 25;
        double d = 12.4;
        char k = '$';
        
        System.out.println("'alma'");
        System.out.println("\"alma\"");
        System.out.println("d:"+d);
        System.out.println(i+d);         // double lesz az érték
        System.out.println("d:"+d+i);      // konkatenálás, minden string lesz
        System.out.println(d+'k');      //a k integerbe castolódik számalapú értéke szerint
        System.out.println(d+"k");
        System.out.println('k'+ d);
        System.out.println(k + d);         // a K a $ és annak a számalapú értéke szerint változik át
        
    }
    
}
