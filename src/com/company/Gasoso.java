package com.company;

public class Gasoso extends Fluido{


    public Gasoso(String nome) {
        super(nome);
    }

    public void fluir() {
        System.out.println(this.getNome() + " vazando...");
    }
}
