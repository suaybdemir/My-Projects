/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vize_1_calismalari;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Azalarak_giden_yildiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a;
        int sayac = 0 ;
        {
        
            
            System.out.println(" Lutfen bir pozitif tamsayi giriniz");
            a = input.nextInt();
            
            
        }while(a<0);
        
        for (int i = 1; i <= a ; i++)//satir sayisi icin
        {
            for (int j = 1; j <=a-sayac; j++)//sutun sayısı
            {
                System.out.print("*");
            }
            sayac++ ;
            System.out.println();
            
                            
        }
        
         
        
        
        
    }
    
}
