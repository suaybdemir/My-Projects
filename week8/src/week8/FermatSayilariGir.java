/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class FermatSayilariGir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        /* Fermat sayiları 2 uzeri 2 uzeri degısken  ve bu islemin belirlenen degisken ile sonucuna bir eklenmesiyle olusturulan sayilara denir . Buna gore fermat sayılarını
        verilen terim sayisina gore bulan program */
        
        int a ;
        double b ;
        
        do
        {
            System.out.println(" Bir terim sayisi gir ");
            a = input.nextInt();
        }while(a<0);
        
        for (int i = 1; i <a; i++) {
            b = Math.pow(2,Math.pow(2,i))+1 ;//2^2^i + 1 hesaplayıcı
            System.out.println(b);//yazdir fermat sayisini
        }
    }
    
    
}
