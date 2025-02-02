package Ex_01;


//1. Atualize a classe Carro, para além de marca, modelo e ano, deve ter os seguintes parâmetros: potência,
//cilindrada, tipoCombustivel, litros100Km.
//a. Tipo Combustível deve ser uma enumeração: GASOLINA, DIESEL, GPL.
//b. Altere o metodo ligar para que imprima uma mensagem de acordo com as seguintes
//especificações:
//c. Crie um metodo chamado corrida que receba um adversário como parâmetro e retorne o carro
//vendedor. O vencedor é o carro com mais potência (caso seja a mesma o fator de desempate é a
//cilindrada (o maior ganha), caso contrário o fator de desempate é a idade (o mais recente ganha),
//caso contrário temos empate).
//d. Crie um metodo que receba como parâmetro uma distância (em km), e que calcule o valor
//consumido em litros do combustível.
//e. Teste a classe instanciando dois carros ao seu gosto e faça uma corrida entre os dois, imprima o
//vencedor. Seguidamente, calcule quanto é que os dois carros iam gastar numa viagem de 97km. E
//imprima na consola quanto gastaria cada um, e qual dos dois é que ia gastar mais.

public class Carro {

    // Atributos de instância
    private String marca;
    private String modelo;
    private int anoFabrico;
    private int potenciaCv;
    private int cc;
    private TipoCombustivel combustivel;
    private double consumoL100Km;


    // Metodo construtor
    public Carro(String marca, String modelo, int anoFabrico, int potenciaCv, int cc, TipoCombustivel combustivel, double consumoL100Km) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potenciaCv = potenciaCv;
        this.cc = cc;
        this.combustivel = combustivel;
        this.consumoL100Km = consumoL100Km;
    }


    // Métodos de acesso


    // Métodos de instância

    public int idade() {
        return 2025 - this.anoFabrico;
    }

    public void ligar() {
        if (this.idade() > 30) { // Temos um carro antigo ( >30 anos )

            if (this.combustivel.equals(TipoCombustivel.DIESEL)) { // Carro a Diesel
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            } else { // Temos um carro não-Diesel
                System.out.println("Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }

        } else { // Temos um carro recente (30 anos ou inferior)

            if (this.potenciaCv < 250) { // Temos um carro com menos de 250 cv
                System.out.println("O carro está ligado!");
                System.out.println("Vrummmmmmmmmmmm");
            } else { // Temos um carro com 250 cv ou mais
                System.out.println("O carro está ligado!");
                System.out.println("VRUMMMMMMMMMMMMMM");
            }

        }
    }

    public Carro corrida(Carro adversario) {

        if (this.potenciaCv > adversario.potenciaCv){ // Ganha o meu carro por cv
            return this;
        } else if (this.potenciaCv < adversario.potenciaCv) { // Ganha o adversario por cv
            return adversario;
        }else{ // Empate por cv

            if( this.cc > adversario.cc){ // Ganha o meu carro por cc
                return this;
            } else if (this.cc < adversario.cc) { // Ganha o adversario por cc
                return adversario;
            }else{ // Empate de cc

                if( this.anoFabrico > adversario.anoFabrico){ // Ganha o meu carro por idade
                    return this;
                } else if (this.anoFabrico < adversario.anoFabrico) { // Ganha o adversario por idade
                    return adversario;
                }else{ // Empate
                    return null;
                }

            }

        }

    }

    public double consumo(double distanciaKm){
        distanciaKm = distanciaKm * this.consumoL100Km/100;
        return distanciaKm;

    }

    public String getMarca() {
        return marca;
    }

    public void exibirDetalhes(){
        System.out.println(this.marca + " | "+this.modelo+" | "+this.anoFabrico);
    }

}