package Ex_07;

//7. Crie uma classe chamada "Livro" com os seguintes atributos: título, autor, categoria, número de páginas e
//ISBN. Em seguida, crie um metodo na classe "Livro" chamado "exibirDetalhes" que imprime na consola
//todos os atributos do livro. De seguida, crie dois objetos da classe "Livro" e invoque o metodo
//"exibirDetalhes" para cada um deles.

public class Livro {
    private String titulo;
    private String autor;
    private String categoria;
    private int numPaginas;
    private String isbn;

    public Livro(String titulo, String autor, String categoria, int numPaginas, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numPaginas = numPaginas;
        this.isbn = isbn;
    }

    public void exibirDetalhes() {
        System.out.println("********** " + this.titulo + " **********");
        System.out.println(this.autor + " | Categoria: " + this.categoria);
        System.out.println(this.numPaginas + " páginas | ISBN: " + this.isbn);
    }

}
