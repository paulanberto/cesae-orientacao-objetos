package Ex_02;

//2. Atualize a classe Conta: para além dos atributos número da conta, saldo e titular da conta, deve também
//ter ano de abertura, margem de empréstimo e valor em divida.
//a. O metodo de construtor não muda a nível de parâmetros.
//b. O ano de criação da conta deve ser 2023- ok
//c. A margem de empréstimo deve ser 90% do saldo (ex: se a conta tem 1000€, a conta pode fazer um
//d. empréstimo até 900€). Sempre que o saldo alterar, também esta margem deve mudar - ok
//e. Crie o metodo pedirEmprestimo, deve receber como parâmetro o valor a pedir. Seguidamente,
//avalie se a conta pode pedir um empréstimo com esse valor. Se houver qualquer valor em dívida,
//o pedido deve ser automaticamente desconsiderado (só pode ter um empréstimo de cada vez).
//Caso seja possível, atualize o saldo e valor em dívida com o dinheiro pedido e retorne true. Caso
//não seja possível, não atualize saldo nem valor em dívida e retorne false.

public class Conta {
    private String numeroConta;
    private double saldo = 0;
    private String titular;
    private int anoAbertura = 2023;
    private double margemEmprestimo = 0.9;
    private double valorDivida;

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

    public boolean pedirEmprestimo(double valorEmprestimo) {
        double limiteEmprestimo = this.saldo * this.margemEmprestimo;

        if(limiteEmprestimo >= valorEmprestimo && valorDivida == 0) {
            this.saldo += valorEmprestimo;
            this.valorDivida += valorEmprestimo;
            System.out.println("Foi concedido o empréstimo de: " + valorEmprestimo + ". Seu novo saldo é: " + this.saldo + " Você possui uma nova divida de: " + this.valorDivida);
            return true;
        }
        else if (limiteEmprestimo >= valorEmprestimo && valorDivida > 0) {
            System.out.println("Não foi possível conceder um empréstimo. Você já possui um valor em dívida de: " + this.valorDivida);
            return false;
        }
        else {
            System.out.println("Você não possui saldo suficiente para este valor de empréstimo");
            return false;
        }
    }

    public void exibirDetalhes() {
        System.out.println("Numero Conta: " + this.numeroConta + "\t| Titular: " + this.titular + "\t| Saldo: " + this.saldo + " €"+ "\t| Dívida: " + this.valorDivida + " €");
    }
}