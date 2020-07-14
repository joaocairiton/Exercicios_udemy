/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_estruturas_repetitivas_01;

import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class Ex_Estruturas_repetitivas_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha invalida");
            senha = sc.nextInt();

        }
        System.out.println("acesso Permitido");

        sc.close();

    }

}
