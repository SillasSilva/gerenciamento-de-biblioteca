package com.biblioteca;

public class Revista extends ItemBiblioteca {

    private int edicao;

    public Revista (String titulo, String identificador, int edicao) {
        super(titulo, identificador, edicao);
    }

    public int calcularPrazoDevolucaoDias(){
        return 7;
    }
    public int getEdicao(){
        return edicao;
    }

}
