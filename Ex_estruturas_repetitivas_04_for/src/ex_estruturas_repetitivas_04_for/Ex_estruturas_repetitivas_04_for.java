/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_estruturas_repetitivas_04_for;

import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class Ex_estruturas_repetitivas_04_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         for( int i=0; i<n; i++){             
         
             int x = sc.nextInt();
             int y = sc.nextInt();
             if(y ==0){
             System.out.println("DIVISAO IMPOSSOVEL! ");
             
             }
             else{
             
             double div = (double)x / y;
             
                 System.out.printf("%.1f%n",div);
             
             }
         }
         
        sc.close();
    }
    
}
