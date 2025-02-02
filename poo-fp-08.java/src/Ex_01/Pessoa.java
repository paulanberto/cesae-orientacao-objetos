package Ex_01;

//1. Escreva um programa onde cria uma classe chamada "Pessoa" com um atributo de nome, idade e altura.
//Crie duas instâncias da classe "Pessoa", defina os seus atributos usando o construtor e imprima seu nome,
//idade e altura.

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

}
