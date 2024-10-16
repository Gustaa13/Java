package model;

public class Revista implements Material{
    String titulo;
    String editora;
    int numeroPaginas;

    public Revista(){
        
    }

    public Revista(String titulo, String editora, int numeroPaginas) {
        this.titulo = titulo;
        this.editora = editora;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void exibirDetalhes(){
        System.out.println("-------- Revista -----------");
        System.out.println("Título: " + titulo);
        System.out.println("Editora: " + editora);
        System.out.println("Páginas: " + numeroPaginas);
        System.out.println("\n");
    }
}
