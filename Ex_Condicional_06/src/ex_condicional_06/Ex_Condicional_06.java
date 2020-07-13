/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_condicional_06;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class Ex_Condicional_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double numero = sc.nextDouble();

        if (numero < 0.0 || numero > 100.0) {
            System.out.println("Fora do Intervalo");
        } else if (numero <= 25.0) {
            System.out.println("Intervalo [0,25]");
        } else if (numero <= 50.0) {
            System.out.println("Intervalo [25,50]");
        } else if (numero <= 75.0) {
            System.out.println("Intervalo [50,75]");
        } else {
            System.out.println("Intervalo [75,100]");
        }

        sc.close();
    }

}
