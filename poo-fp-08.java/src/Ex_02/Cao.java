package Ex_02;

//2. Escreva um programa onde cria uma classe chamada "Cao" com um nome (String), um atributo de raça
//(String) e um atributo latido (String) que por defeito deve ser “Au au au”.
//a. Deve conter um metodo de ladrar (imprime na consola o respetivo latido).
//b. Crie três instâncias da classe "Cão", defina os seus atributos (nome e raça) usando o construtor.
//c. Modifique o latido usando os métodos setter e invoque o metodo latir.

public class Cao {
    //Atributos de instancia
    private String nome;
    private String raca;
    private String latido = "Au au au";

    //Metodos construtores
    public Cao(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    //Metodo de acesso (setting e getting)
    public void setLatido(String latido) {
        this.latido = latido;
    }

    //Metodo de intancia
    public void ladrar(){
        System.out.println(latido);
    }

    //Exemplo de mais um metodo nao obrigatorio na estrutura
    public void ladrar(int quantidadeVezes){
        for(int i = 0; i < quantidadeVezes; i++){
            System.out.println(this.latido);
        }
    }
}
