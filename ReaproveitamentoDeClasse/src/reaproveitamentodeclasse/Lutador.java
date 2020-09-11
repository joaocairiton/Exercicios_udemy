/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reaproveitamentodeclasse;

/**
 *
 * @author joaoc
 */
public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int empate;
    private int derrotas;

    public void status() {
        System.out.println(getNome());
        System.out.println("Peso" + getCategoria());
        System.out.println("vitorias" + getVitoria());
        System.out.println("derrotas" + getDerrotas());
        System.out.println("empates" + getEmpate());
      

    }

    public void apresentar() {
        System.out.println("lutador" + getNome());
        System.out.println("origem" + getNacionalidade());
        System.out.println("anos" + getIdade());
        System.out.println("altura" + getAltura());
        System.out.println("pesando" + getPeso() + "kg");
        System.out.println("ganhor" + getVitoria());
        System.out.println("empates" + getEmpate());
        System.out.println("perdeu" + getDerrotas());
          System.out.println("---------------------------------");

    }

    public void ganharLuta() {
        setVitoria(getVitoria() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);

    }

    public void empatarLuta() {
        setEmpate(getEmpate());
    }

    //--------------------------------------------------------------------------
    public Lutador(String no, String na, int id, float al, float pe, int vi, int em, int de) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitoria = vi;
        this.empate = em;
        this.derrotas = de;
    }

    /*---------------------------------------------------------------------------*/
    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private float getAltura() {
        return altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    private float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {

        if (this.peso < 52.2) {
            this.categoria = "invalido";

        } else if (this.peso <= 70.3) {

            this.categoria = "peso Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "peso medio";

        } else if (this.peso <= 120.2) {

            this.categoria = "peso pesado";
        }

    }

    private int getVitoria() {
        return vitoria;
    }

    private void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    private int getEmpate() {
        return empate;
    }

    private void setEmpate(int empate) {
        this.empate = empate;
    }

    private int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

}
