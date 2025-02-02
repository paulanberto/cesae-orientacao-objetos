package Ex_03;

//3. Crie uma classe animal, que tenha como atributos: nome, espécie, país de origem, peso (em kg) e
//alimentação (array de Strings).
//a. Crie um metodo para o animal comer, receba como parâmetro o alimento e o peso (em g). Se o
//alimento constar na lista de alimentos que o animal come, incremente o seu peso com o peso da
//refeição e imprima na consola “O animal comeu”. Caso contrário, não deve atualizar e imprimir na
//consola “O animal recusou essa comida”.
//b. Teste a classe instanciando um animal e apresentado uma refeição que ele goste, seguidamente
//imprima o seu novo peso. A seguir, apresente uma refeição que ele não goste e imprima o seu
//peso.

public class Animal {
    private String nome;
    private String especie;
    private String paisOrigem;
    private double pesoKg;
    private String[] alimentacao;

    public Animal(String nome, String especie, String paisOrigem, double pesoKg, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.pesoKg = pesoKg;
        this.alimentacao = alimentacao;
    }

    public boolean comer(String alimento, double pesoG) {

        for (int i = 0; i < this.alimentacao.length; i++) {

            if (this.alimentacao[i].equals(alimento)) {
                // Encontramos a comida que ele gosta. Vai comer
                System.out.println(this.nome + " comeu " + alimento);
                this.pesoKg += pesoG / 1000;
                return true;
            }
        }

        System.out.println(this.nome+" não comeu.");
        return false;

    }

    public void exibirDetalhes() {
        System.out.println(this.nome + " | " + this.especie + " | País: " + this.paisOrigem + " | Peso: " + this.pesoKg + " Kg.");
    }
}






