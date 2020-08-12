/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author morva
 */
public class Atithmetic2 {
    public static void main(String[] args) {
        int counter = 0;
      //  counter = counter + 1;  //1 konstans érték
        counter += 1;
        counter++;              //léptető operátor
        ++counter;
        
        counter = 0;
        System.out.println(counter++);
        int a = 3 * counter++;
        System.out.println(a);
        System.out.println(counter);
        System.out.println("***********************");
        counter = 0;
        System.out.println(++counter);
        a = 3 * ++counter;
        System.out.println(a);
        System.out.println(counter);
        
        System.out.println(12 + ++counter);
    }
    
}
