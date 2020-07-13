/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_condicional_01;

import java.util.Scanner;
import javax.sound.midi.Soundbank;

/**
 *
 * @author joaoc
 */
public class Ex_Condicional_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        
        if(n < 0){
            
            System.out.println("NEGATIVO");       
        
        }
        else{
            
            System.out.println("POSITIVO");       
        
        }
        
        
        sc.close();
    }
    
}
