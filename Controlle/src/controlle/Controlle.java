/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlle;

/**
 *
 * @author joaoc
 */
public class Controlle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controler c1 = new Controler();
        
        c1.ligar();
        c1.play();
        c1.maisVolume();        
        c1.abrirMenu();
        c1.fecharMenu();
    }
    
}
