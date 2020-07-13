/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_01;

import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class Exercicios_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       int A, B, soma;
       
       A= sc.nextInt();
       B= sc.nextInt();
       
       soma= A+B;
       
        System.out.println("SOMA" + soma);
        
       
       sc.close();
    }
    
}
