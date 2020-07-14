/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_estruturas_repetitivas_03;

import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class Ex_Estruturas_repetitivas_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;

        int tipo = sc.nextInt();

        while (tipo != 4) {

            if (tipo == 1) {
                alcool = alcool + 1;
                
            } else if (tipo == 2) {
                gasolina = gasolina + 1;
                
            } else if (tipo == 3) {
                diesel = diesel + 1;
                
            }

            tipo = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO ");
        System.out.println("ALCOOL " +alcool);
        System.out.println("GASOLINA " + gasolina);        
        System.out.println("DIESEL " +diesel);

        sc.close();
    }

}
