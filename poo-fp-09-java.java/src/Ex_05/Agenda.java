package Ex_05;

import Ex_06.Atleta;

public class Agenda {
    private Pessoa[] pessoas;

    public Agenda() {
        this.pessoas = new Pessoa[1000];
    }

    public void adicionarPessoas(Pessoa novaPessoa) {

        for (int i = 0; i < this.pessoas.length; i++) {

            if (this.pessoas[i] == null) { // Encontramos uma posição vazia
                this.pessoas[i] = novaPessoa;
                System.out.println("Atleta Inscrito: " + novaPessoa.getNome());
                return;
            }
        }

        System.out.println("Atleta não inscrito porque não vagas: "+novaPessoa.getNome());
    }


}
