/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exxercicios_04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class Exxercicios_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int num, hr;
        double valorh, sal;
        
        num = sc.nextInt();
        hr = sc.nextInt();
        valorh = sc.nextDouble();
        
        sal = valorh * hr;
        
        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f%n ", sal);
        
        
        sc.close();
    }
    
}
