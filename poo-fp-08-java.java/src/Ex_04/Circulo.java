package Ex_04;

//4. Escreva um programa onde cria uma classe chamada "Circulo" com um atributo raio.
//a. Instancie um círculo.
//b. Crie métodos para calcular a área e a circunferência do círculo.

public class Circulo {

    // Atributos de instância
    private double raio;

    // Método construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Métodos de acesso


    // Metodos de instância
    public double circuferencia() { // 2*pi*r
        return 2 * 3.14 * this.raio;
    }

    public double area() { // pi*raio^2
        return 3.14 * this.raio * this.raio;
    }


}