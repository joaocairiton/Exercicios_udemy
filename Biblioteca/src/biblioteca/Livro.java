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
public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totalPagina;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //-------metodos especiais----------//
    public String detalhes() {
        return "Livro{" + "\n titulo=" + titulo + "\n Autor = " + autor + "\n pagTotal = "
                + totalPagina + "\n pagAtual= " + pagAtual + "\n Aberto" + aberto + "\n Leitor " + leitor.getNome() + "\n sexo: " + leitor.getSexo() + '}';

    }

//----Construtor----------------//
    public Livro(String titulo, String autor, int totalPagina, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPagina = totalPagina;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    //--------getter e setters-----------
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPagina() {
        return totalPagina;
    }

    public void setTotalPagina(int totalPagina) {
        this.totalPagina = totalPagina;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

//------metodos da interfaces-------------//
    @Override
    public void abrir() {
        this.aberto = true;

    }

    @Override
    public void fechar() {

        this.aberto = false;

    }

    @Override
    public void folhear(int p) {
        if (p > this.totalPagina) {
            this.pagAtual = 0;

        } else {

            this.pagAtual = p;
        }

    }

    @Override
    public void avancarPag() {
        this.pagAtual++;

    }

    @Override
    public void voltarPag() {
        this.pagAtual--;

    }

}
