package Ex_06;

//6. Crie uma classe sem atributos chamada "Calculadora".
//a. Elabore métodos para adição, subtração, multiplicação e divisão (Estes métodos devem receber
//dois números reais como argumentos e, no final, apresentar na consola o resultado).
//b. Crie um objeto dessa classe e use os métodos para realizar algumas operações matemáticas (deve
//realizar, pelo menos, uma de cada).

public class Calculadora {

    // Atributos de instância

    // Método construtor
    public Calculadora() {

    }

    // Métodos de acesso

    // Métodos de instância
    public double soma(double num1, double num2) {
        return num1 + num2;
    }

    public double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public double divisao(double num1, double num2) {
        return num1 / num2;
    }

}