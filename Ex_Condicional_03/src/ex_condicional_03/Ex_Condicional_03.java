/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_condicional_03;

import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class Ex_Condicional_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a % b ==0 || b % a == 0){
        System.out.println("Sao Multiplos");
    
    }else{
            System.out.println("Nao Sao Multiplos");
        }
        
        sc.close();
    }
    
}
