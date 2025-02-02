package Ex_07;

import Ex_02.Cao;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Espíritos", "Zibia", "Religioso", 200, "1293546");
        Livro livro2 = new Livro("Misery", "Stephen", "Suspense", 250, "1295698");
        Livro livro3 = new Livro("1984", "Orwell", "Romance", 311, "38190236");

        livro1.exibirDetalhes();
        System.out.println();

        livro2.exibirDetalhes();
        System.out.println();

        livro3.exibirDetalhes();
        System.out.println();
    }
}
