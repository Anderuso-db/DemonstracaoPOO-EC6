package com.company;

public class Main {

    public static void main(String[] args) {
	    Gasoso gas = new Gasoso("Amônia");
	    gas.setAcido(true);
	    gas.setInflamavel(false);

	    Liquido liquid = new Liquido("Gasolina");
	    liquid.setInflamavel(true);
	    liquid.setAcido(false);

	    liquid.fluir();
	    gas.fluir();

	    gas.InteracaoDeFluidosPerigosos(liquid);
    }

}
