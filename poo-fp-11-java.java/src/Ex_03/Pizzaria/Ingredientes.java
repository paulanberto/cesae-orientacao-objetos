package Ex_03.Pizzaria;

import Ex_03.Enums.UnidadeMedida;

public class Ingredientes{
    private int codigoIngrediente;
    private String nomeIngrediente;
    private UnidadeMedida unidadeMedida;
    private double kcal;


    public Ingredientes(int codigoIngrediente, String nomeIngrediente, UnidadeMedida unidadeMedida, double kcal) {
        this.codigoIngrediente = codigoIngrediente;
        this.nomeIngrediente = nomeIngrediente;
        this.unidadeMedida = unidadeMedida;
        this.kcal = kcal;
    }



}
