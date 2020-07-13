/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_condicional_04;

import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class Ex_Condicional_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hrInicial = sc.nextInt();
        int hrFinal = sc.nextInt();
        
        int duracao;
        if(hrInicial < hrFinal){
           duracao = hrFinal - hrInicial;
                  
        }
        else{
        duracao = 24 - hrInicial + hrFinal;
        }
        
        System.out.println("O JOGO DUROU " + duracao + "HORA(S)");
        
        sc.close();
    }
    
    
}
