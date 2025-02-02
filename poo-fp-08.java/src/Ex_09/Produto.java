package Ex_09;


//9. Crie uma classe Produto que tenha os atributos nome, preço e quantidade em stock (deve ser inicializada a
//0), e os métodos comprar e vender, que recebam a quantidade desejada como parâmetro e atualizem o
//stock.
//a. Para vender um produto, deve analisar se existe stock suficiente. Caso exista stock suficiente deve
//atualizar o stock. Caso não exista stock suficiente deve informar o utilizador que tal transação não
//é possível por quebra de stock do produto.
//b. No metodo main, crie um objeto dessa classe Produto e chame o método para comprar 5
//unidades.
//c. Invoque o metodo para vender 2 unidades, e imprima a quantidade de stock.
//d. Invoque o metodo para comprar 10 unidades.
//e. Invoque o metodo para vender 35 unidades.


public class Produto {
    private String nome;
    private double preco;
    private int stock = 0;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void comprar(int quantidade) {
        this.stock += quantidade;
    }

    public void vender(int quantidade) {
        if (this.stock >= quantidade) {
            this.stock -= quantidade;
        } else {
            System.out.println("Stock insuficiente");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Stock Atual: " + this.stock);
        System.out.println("");
    }

}
