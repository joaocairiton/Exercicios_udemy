/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_estruturas_repetitivas_02;

import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class Ex_Estruturas_repetitivas_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();


        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("Primeiro");

            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
                
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            }

            System.out.println("Quarto");

        }

        x = sc.nextInt();
        y = sc.nextInt();

        sc.close();
    }

}
