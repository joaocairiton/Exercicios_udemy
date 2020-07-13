/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_03;

import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class Exercicios_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, c, d, dif;
        
        a=sc.nextInt();
         b=sc.nextInt();
          c=sc.nextInt();
           d=sc.nextInt();
           
           dif= a*b-c*d;
           
           System.out.println("DIFERENCA = "+ dif);
           
           sc.close();
        
        
    }
    
}
