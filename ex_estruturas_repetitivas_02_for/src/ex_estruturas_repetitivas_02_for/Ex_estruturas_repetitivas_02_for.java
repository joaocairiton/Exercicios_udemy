/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_estruturas_repetitivas_02_for;

import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class Ex_estruturas_repetitivas_02_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int in = 0;
        int out = 0;

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x >= 10 && x <= 20) {
                in = in + 1;
            } else {
                out = out + 1;
            }

        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }

}
