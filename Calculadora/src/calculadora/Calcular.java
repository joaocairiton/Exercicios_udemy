/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author joaoc
 */
public class Calcular {

    private String valores;
    private double resultado;
    private boolean soma;
    private boolean divisao;
    private boolean multiplicacao;
    private boolean subtracao;
    

    public Calcular() {

        valores = "";
        resultado = 0;
        soma = false;
        divisao = false;
        multiplicacao = false;
        subtracao = false;
        clear ();
    }

    public String getValores() {
        return valores;
    }

    public void setValores(String valores) {
        this.valores = valores;
    }

    public void digiteNumero(int num) {

        setValores(valores + num);

    }

    public void somar(String num) {
        this.resultado = Double.parseDouble(num);
        soma = true;
        setValores("");

    }

    public void divisao(String num) {
        this.resultado = Double.parseDouble(num);
        divisao = true;
        setValores("");

    }

    public void multiplicacao(String num) {
        this.resultado = Double.parseDouble(num);
        multiplicacao = true;
        setValores("");

    }

    public void subtracao(String num) {
        this.resultado = Double.parseDouble(num);
        subtracao = true;
        setValores("");

    }
    
    

    public void clear() {
        
        this.resultado = 0;
        this.valores = "";

    }

    public double calculo(String numero) {
        if (soma == true) {
            resultado = resultado + Double.parseDouble(numero);
        }

        if (divisao == true) {
            resultado = resultado / Double.parseDouble(numero);
        }

        if (multiplicacao == true) {
            resultado = resultado * Double.parseDouble(numero);
        }

        if (subtracao == true) {
            resultado = resultado - Double.parseDouble(numero);
        }
        

        soma = false;
        divisao = false;
        multiplicacao = false;
        subtracao = false;

        return resultado;

    }

}
