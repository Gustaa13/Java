package model;

public class Livro implements Material{
    String titulo;
    String autor;
    int anoLancamento;
    String edicao;

    public Livro(){

    }

    public Livro(String titulo, String autor, int anoLancamento, String edicao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.edicao = edicao;
    }

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

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public void exibirDetalhes(){
        System.out.println("-------- Livro -----------");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Lançamento: " + anoLancamento);
        System.out.println("Edição: " + edicao);
        System.out.println("\n");
    }
}
