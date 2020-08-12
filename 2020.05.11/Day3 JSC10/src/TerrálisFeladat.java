/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author morva
 */
public class TerrálisFeladat {
    public static void main(String[] args) {
        int i = -4;
//        if(i < 0){
//            i = -1 * i;
//        } else {
//            i = i * 1;
//        };
        System.out.println((i < 0)?"i < 0" : "i >= 0");
        
        i = i < 0? -1 * i : 1 * i;            //terrális kifejezés a ? az if ami utána van az van a törzyben{}, a : az else ág
        System.out.println("i:"+ i);
        }
    }

