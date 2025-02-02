package Ex_04;


import Ex_04.Acabamento;
import Ex_04.TipoImovel;

public class Main {

    public static void main(String[] args) {
        Imovel imovel1 = new Imovel("Brasil", 45, "Porto", TipoImovel.APARTAMENTO, Acabamento.RESTAURO, 180, 3, 2, 5);
        Imovel imovel2 = new Imovel("Rua das Flores", 123, "Lisboa", TipoImovel.CASA, Acabamento.NOVA, 150, 3, 2, 30);
        Imovel imovel3 = new Imovel("Avenida Central", 456, "Porto", TipoImovel.MANSAO, Acabamento.NOVA_ALTO_ACABAMENTO, 300, 5, 4, 50);

        imovel1.imprimirDetalhes();
        System.out.println();
        imovel2.imprimirDetalhes();
        System.out.println();
        imovel3.imprimirDetalhes();
        System.out.println();

        System.out.println("_______________________________________________");


        imovel1.mudarEstado(Acabamento.NOVA_ALTO_ACABAMENTO);

        imovel1.imprimirDetalhes();
        System.out.println();

        System.out.println("_______________________________________________");

        Imovel imovelMaisCaro = imovel1.compararImoveis(imovel2);
        System.out.println("O imóvel mais caro é:");
        imovelMaisCaro.imprimirDetalhes();

    }
}
