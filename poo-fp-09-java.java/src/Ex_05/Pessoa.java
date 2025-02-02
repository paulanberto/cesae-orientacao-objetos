package Ex_05;

//5. Crie uma classe chamada "Pessoa" que armazena informações básicas sobre uma pessoa, como nome,
//idade, email e telemóvel. De seguida, crie uma classe chamada "Agenda" que armazena um conjunto de
//objetos Pessoa num array. A classe Agenda terá um metodo para adicionar novas pessoas e outro para
//listar todas as pessoas registadas.

public class Pessoa {
    private String nome;
    private int idade;
    private String email;
    private int telefone;

    public Pessoa(String nome, int idade, String email, int telefone) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

}
