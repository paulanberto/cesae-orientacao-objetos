package Ex_05;

//5. Crie uma classe chamada "Carro" com os seguintes atributos: marca, modelo e ano de fabrico.
//a. Crie um metodo na classe "Carro" chamado "ligar" que imprime a mensagem "O carro está
//ligado".
//b. Crie um objeto da classe "Carro" e invoque o metodo "ligar".

public class Carro {

    // Atributos de instância
    private String marca;
    private String modelo;
    private int anoFabrico;

    // Metodo construtor
    public Carro(String marca, String modelo, int anoFabrico) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
    }

    // Métodos de acesso

    // Métodos de instância
    public void ligar(){
        System.out.println("O carro está ligado");
    }

}