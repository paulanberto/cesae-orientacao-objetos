package Ex_01;

import Ex_01.Avioes.AviaoCombate;
import Ex_01.Avioes.Avioes;
import Ex_01.Avioes.JatoParticular;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Avioes> listaAvioes;

    public Catalogo() {
        this.listaAvioes = new ArrayList<>();
    }

    public void adquirirAviao(Avioes aviaoNovo){
        this.listaAvioes.add(aviaoNovo);
    }

    public void venderAviao(Avioes aviaoNovo){
        this.listaAvioes.remove(aviaoNovo);
    }

    public void exibirDetalhes(){
        for(Avioes aviaoAtual: this.listaAvioes){
            aviaoAtual.exibirDetalhes();
            System.out.println();

            if(aviaoAtual instanceof JatoParticular){
                JatoParticular jatoAtual = (JatoParticular) aviaoAtual;
                jatoAtual.demonstracaoLuxo();
            }

            if(aviaoAtual instanceof AviaoCombate){
                AviaoCombate aviaoCombateAtual = (AviaoCombate) aviaoAtual;
                aviaoCombateAtual.vooRaso();
            }

        }
    }

    public void listarAvioesDisponiveis() {
        if (listaAvioes.isEmpty()) {
            System.out.println("Não há aviões disponíveis para venda no momento.");
            return;
        }

        System.out.println("Aviões disponíveis para venda:");
        for (Avioes aviao : listaAvioes) {
            aviao.exibirDetalhes();
            System.out.println("---------------------------");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;

        for (Avioes aviao : listaAvioes) {
            valorTotal += aviao.getPreco(); // Supondo que a classe Avioes tenha um método getPreco()
        }

        return valorTotal;
    }


}
