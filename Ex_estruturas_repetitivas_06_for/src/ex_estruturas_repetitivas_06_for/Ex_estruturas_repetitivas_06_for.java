/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_estruturas_repetitivas_06_for;

import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class Ex_estruturas_repetitivas_06_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            if(n % i ==0){
            
                System.out.println(i);
            }
            
        
        
        }
        
        sc.close();
    }
    
}
