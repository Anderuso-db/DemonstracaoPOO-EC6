package com.company;

public class Fluido {
    private String nome;
    private boolean acido;
    private boolean inflamavel;

    public Fluido (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void fluir() {
    }

    public void InteracaoDeFluidosPerigosos(Fluido outroFluido){
        System.out.println(this.getNome() + " interage com " + outroFluido.getNome() + "!");

        if(this.isAcido() && outroFluido.isInflamavel() || this.isInflamavel() && outroFluido.isAcido())
            System.out.println("Tá queimando tudo! Tá derretendo tudo também! AAAAA");

        else if(this.isInflamavel() && outroFluido.isInflamavel())
            System.out.println("TÁ PEGANDO FOGO BIXO!");

        else if(this.isAcido() && outroFluido.isAcido())
            System.out.println("TA DERRETENDO TUDO!! ");

        else
            System.out.println("nada acontece");
    }

    public boolean isAcido() {
        return acido;
    }

    public void setAcido(boolean acido) {
        this.acido = acido;
    }

    public boolean isInflamavel() {
        return inflamavel;
    }

    public void setInflamavel(boolean inflamavel) {
        this.inflamavel = inflamavel;
    }
}
