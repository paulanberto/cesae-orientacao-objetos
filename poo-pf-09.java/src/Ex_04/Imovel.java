package Ex_04;

import Ex_01.TipoCombustivel;

////4. Crie uma classe Imóvel, que tenha como atributos: rua, número da porta, cidade, tipo (apartamento, casa,
////mansão), acabamento (para restauro, usada, nova, nova com alto acabamento), área, número de quartos,
////número de casas de banho e área da piscina.
////a. Crie um metodo para calcular o valor do imóvel com base nas seguintes regras:
////i. Apartamento: cada m2 vale 1000€.
////ii. Casa: cada m2 vale 3000€
////iii. Mansão: cada m2 vale 5000€
////iv. Para Restauro: preço total tem 50% de desconto
////v. Usada: preço total tem 10% de desconto
////vi. Nova: preço reflete sem desconto
////vii. Nova com alto acabamento: preço total valoriza 25%
////viii. Cada quarto incrementa 7500€ ao custo
////ix. Cada casa de banho incrementa 10500€ ao custo
////x. A piscina custa 1000/m2
////b. Crie um metodo para mudar o estado de uma casa.
////c. Crie um metodo chamado imprimirDescricao que imprima as especificações do imóvel.
////d. Crie um metodo chamado compararImoveis, que receba outro imóvel como parâmetro e retorne
////qual o imóvel mais caro.
///
///
public class Imovel {
    private String rua;
    private int numeroPorta;
    private String cidade;
    private TipoImovel tipoImovel;
    private Acabamento acabamento;
    private double areaPrivativa;
    private int numeroQuartos;
    private int numeroCasaBanho;
    private double areaPiscina;


    public Imovel(String rua, int numeroPorta, String cidade, TipoImovel tipoImovel, Acabamento acabamento, double areaPrivativa, int numeroQuartos, int numeroCasaBanho, double areaPiscina) {
        this.rua = rua;
        this.numeroPorta = numeroPorta;
        this.cidade = cidade;
        this.tipoImovel = tipoImovel;
        this.acabamento = acabamento;
        this.areaPrivativa = areaPrivativa;
        this.numeroQuartos = numeroQuartos;
        this.numeroCasaBanho = numeroCasaBanho;
        this.areaPiscina = areaPiscina;
    }

    public double calcularValor() {
        double valorBase = 0;
        double valorTotal = 0;
        double valorExtras = (numeroQuartos * 7500) + (numeroCasaBanho * 10500) + (areaPiscina * 1000);
        double valorAcabamento = 0;

        if (this.tipoImovel.equals(TipoImovel.APARTAMENTO)) {
            valorBase = areaPrivativa * 1000;
            if (this.acabamento.equals(Acabamento.RESTAURO)) {
                valorAcabamento = (valorBase + valorExtras) * 0.5;
            } else if (this.acabamento.equals(Acabamento.USADA)) {
                valorAcabamento = (valorBase + valorExtras) * 0.9;
            } else if (this.acabamento.equals(Acabamento.NOVA_ALTO_ACABAMENTO)) {
                valorAcabamento = (valorBase + valorExtras) * 1.25;
            } else {
                valorAcabamento = 0;
            }

            valorTotal = valorBase + valorExtras + valorAcabamento;

            System.out.println(valorTotal);
        }

        if (this.tipoImovel.equals(TipoImovel.CASA)) {
            valorBase = areaPrivativa * 5000;
            if (this.acabamento.equals(Acabamento.RESTAURO)) {
                valorAcabamento = (valorBase + valorExtras) * 0.5;
            } else if (this.acabamento.equals(Acabamento.USADA)) {
                valorAcabamento = (valorBase + valorExtras) * 0.9;
            } else if (this.acabamento.equals(Acabamento.NOVA_ALTO_ACABAMENTO)) {
                valorAcabamento = (valorBase + valorExtras) * 1.25;
            } else {
                valorAcabamento = 0;
            }

            valorTotal = valorBase + valorExtras + valorAcabamento;

            System.out.println(valorTotal);
        }

        if (this.tipoImovel.equals(TipoImovel.MANSAO)) {
            valorBase = areaPrivativa * 3000;
            if (this.acabamento.equals(Acabamento.RESTAURO)) {
                valorAcabamento = (valorBase + valorExtras) * 0.5;
            } else if (this.acabamento.equals(Acabamento.USADA)) {
                valorAcabamento = (valorBase + valorExtras) * 0.9;
            } else if (this.acabamento.equals(Acabamento.NOVA_ALTO_ACABAMENTO)) {
                valorAcabamento = (valorBase + valorExtras) * 1.25;
            } else {
                valorAcabamento = 0;
            }

            valorTotal = valorBase + valorExtras + valorAcabamento;

            System.out.println(valorTotal);
        }

        return valorTotal;


    }



    public void imprimirDetalhes() {
        System.out.println("Descrição do Imóvel:");
        System.out.println("Rua: " + rua);
        System.out.println("Número da Porta: " + numeroPorta);
        System.out.println("Cidade: " + cidade);
        System.out.println("Acabamento: " + acabamento);
        System.out.println("Área: " + areaPrivativa + " m2");
        System.out.println("Número de Quartos: " + numeroQuartos);
        System.out.println("Número de Casas de Banho: " + numeroCasaBanho);
        System.out.println("Área da Piscina: " + areaPiscina + " m2");
        System.out.println("Valor do Imóvel: " + calcularValor() + "€");
    }

    public void mudarEstado(Acabamento novoAcabamento) {
        this.acabamento = novoAcabamento;
    }

    public Imovel compararImoveis(Imovel outroImovel) {
        if (this.calcularValor() > outroImovel.calcularValor()) {
            return this;
        } else {
            return outroImovel;
        }
    }
}



