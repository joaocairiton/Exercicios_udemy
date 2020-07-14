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
public class Ex_Estruturas_repetitivas_04_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }

}
