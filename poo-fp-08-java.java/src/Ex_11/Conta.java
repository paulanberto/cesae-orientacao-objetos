package Ex_11;

//11. Crie um programa para fazer a gestão de contas bancárias:
//• Crie uma classe chamada "Conta" com os seguintes atributos: número da conta, saldo e titular da
//conta.
//• Crie um metodo “transferência” que tenha como parâmetros o valor a transferir e a conta de
//destinatário.
//• Crie os métodos depositar (aumentar saldo), levantar (diminuir saldo) e mostrarSaldo. (Exemplo
//de mostarSaldo: “Saldo da conta 12345: 950 EUR”)
//• O metodo  depositar deve receber um valor como parâmetro e atualizar o saldo.
//• O metodo  levantar deve receber um valor como parâmetro e verificar se é possível realizar a
//operação, considerando o saldo. De seguida, atualiza o saldo se a transação for possível.
//• O metodo  exibirSaldo deve exibir na consola o saldo atual da conta.
//• No metodo  main, crie um objeto da classe Conta e invoque os métodos para depositar 1000€ e
//exibir o saldo.
//• De seguida, invoque o metodo  para levantar 120€ e exiba o saldo.
//• De seguida, crie mais dois objetos da classe e atribua valores aos seus atributos. De seguida,
//transfira um valor de uma conta para a outra.
//• No fim, deve exibir o saldo atual das três contas.

public class Conta {
    private String numeroConta;
    private double saldo = 0;
    private String titular;

    public Conta(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public void depositar(double valor) {
        System.out.println("Depósito Efetuado: " + valor);
        this.saldo += valor;
    }

    public void levantar(double valor) {
        if (this.saldo >= valor) {
            System.out.println("Levantamento Efetuado: " + valor);
            this.saldo -= valor;
        } else {
            System.out.println("Levantamento Recusado. Saldo Insuficiente.");
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        if (this.saldo >= valor) {
            System.out.println("Transferencia Efetuada: " + valor);
            this.saldo -= valor;
            contaDestino.saldo += valor;
        } else {
            System.out.println("Transferência Recusada. Saldo Insuficiente.");
        }
    }


    public void exibirDetalhes() {
        System.out.println("Numero Conta: " + this.numeroConta + "\t| Titular: " + this.titular + "\t| Saldo: " + this.saldo + " €");
    }
}