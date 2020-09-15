/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author joaoc
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("gordofredo", 20, "m");
        p[1] = new Pessoa("bastiana", 20, "f");

        l[1] = new Livro("como ficar rico", "seila", 200, p[0]);

        l[1].abrir();
        l[1].folhear(126);
        l[1].avancarPag();
        
        System.out.println(l[1].detalhes());

    }

}
