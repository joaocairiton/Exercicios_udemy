/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_condicional_02;

import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class Ex_Condicional_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int n = sc.nextInt();
        
        if(n%2 ==0){
        
            System.out.println("PAR");
        
        }
        else{
        
            System.out.println("IMPAR");
        }
        
        sc.close();
    }
    
}
