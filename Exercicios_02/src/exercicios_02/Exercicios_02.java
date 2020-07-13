/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios_02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class Exercicios_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double r, a, pi =3.14159;
        
        r = sc.nextDouble();
        
        a= pi * r*r;
        
        System.out.printf("a=%.4f%n", a);
        
        sc.close();
    }
    
}
