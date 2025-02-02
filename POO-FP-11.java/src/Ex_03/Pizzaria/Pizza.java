package Ex_03.Pizzaria;

import Ex_03.Enums.Tamanho;

import java.util.ArrayList;

public class Pizza {

    private final int MAX_INGREDIENTES = 5;
    private int codigo;
    private String nome;
    private String descricao;
    private double preco;
    private Tamanho tamanho;
    private ArrayList<IngredientePizza> ingredientes;

    public Pizza(int codigo, String nome, String descricao, double preco, Tamanho tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.ingredientes = new ArrayList<IngredientePizza>();
    }

    public void adicionarIngredientes(IngredientePizza ingredienteNovo){
        if (this.ingredientes.size() < MAX_INGREDIENTES) {
            this.ingredientes.add(ingredienteNovo);
            System.out.println("Ingrediente " + ingredienteNovo.getIngredientes().getNome() + " adicionado");
        } else {
            System.out.println("Não é possível adicionar mais ingredientes. A pizza já possui 5 ingredientes.");
        }
    }

    public void retirarIngredientes(IngredientePizza ingredienteNovo){
        this.ingredientes.remove(ingredienteNovo);
    }


    public void exibirDetalhes() {
        System.out.println("_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_  Pizza Portugal   _*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_");
        System.out.println("Código: " + this.codigo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Preço: " + this.preco);
        System.out.println("Tamanho: " + this.tamanho);

        int contador = 0;

        for (IngredientePizza ingrediente : this.ingredientes) {
            System.out.println("Ingrediente ");
            System.out.println("Ingrediente 2: ");
            System.out.println("Ingrediente 3: ");
            System.out.println("Ingrediente 4: ");
            System.out.println("Ingrediente 5: ");
        }

    }


}
