/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_estruturas_repetitivas_05_for;

import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class Ex_estruturas_repetitivas_05_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat = fat * i;

        }
        System.out.println(fat);

        sc.close();
    }

}
