/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author joaoc
 */
public class Sequencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double largura = sc.nextDouble();
        double comprimentro = sc.nextDouble();
        double mtQuadrado = sc.nextDouble();
        
        double area = largura * comprimentro;
        double preco = area * mtQuadrado;
        
        System.out.printf("AREA = %.2f%n", area);
         System.out.printf("PRECO = %.2f%n", preco);
        
        sc.close();
    }
    
}
