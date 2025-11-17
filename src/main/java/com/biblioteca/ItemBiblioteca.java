package com.biblioteca;

// A classe é 'abstract' porque contém um método abstrato e não pode ser instanciada.
public abstract class ItemBiblioteca {

    // Protected: visível para a própria classe e para as classes filhas (Livro, Revista).
    protected String titulo;
    protected String identificador;
    protected int totalDeCopias;
    protected int totalEmprestado;



    // Construtor: Inicializa os atributos comuns.
    public ItemBiblioteca (String titulo, String identificador, int totalDeCopias) {
        this.titulo = titulo;
        this.identificador = identificador;
        this.totalDeCopias = totalDeCopias;
    }

    // Getters para os atributos comuns
    public String getTitulo() {
        return titulo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public int getTotalDeCopias() {
        return totalDeCopias;
    }

    public int getCopiasDisponiveis () {
        return this.totalDeCopias - totalEmprestado;
    }

    // MÉTODO ABSTRATO: Não tem corpo (não sabemos o prazo aqui).
    // Obriga todas as subclasses a fornecerem sua própria regra de devolução.
    public abstract int calcularPrazoDevolucaoDias();
}