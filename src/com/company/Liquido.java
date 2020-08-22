package com.company;

public class Liquido extends Fluido{

    public Liquido(String nome) {
        super(nome);
    }

    public void fluir() {
        System.out.println(this.getNome() + " escorre...");
    }
}
