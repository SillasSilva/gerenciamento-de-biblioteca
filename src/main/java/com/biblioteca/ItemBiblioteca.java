package com.biblioteca;

// A classe é 'abstract' porque contém um método abstrato e não pode ser instanciada.
public abstract class ItemBiblioteca {

    // Protected: visível para a própria classe e para as classes filhas (Livro, Revista).
    protected String titulo;
    protected String identificador;

    // Construtor: Inicializa os atributos comuns.
    public ItemBiblioteca (String titulo, String identificador) {
        this.titulo = titulo;
        this.identificador = identificador;
    }

    // Getters para os atributos comuns
    public String getTitulo() {
        return titulo;
    }

    public String getIdentificador() {
        return identificador;
    }

    // MÉTODO ABSTRATO: Não tem corpo (não sabemos o prazo aqui).
    // Obriga todas as subclasses a fornecerem sua própria regra de devolução.
    public abstract int calcularPrazoDevolucaoDias();
}