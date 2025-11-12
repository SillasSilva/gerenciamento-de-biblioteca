package com.biblioteca;

public class Livro {
    String titulo;
    String autor;
    String identificador;
    private int totalDeCopias;
    private int totalEmprestado;

    public void Livro(String titulo, String autor,String identificador, int totalDeCopias) {
        this.titulo = titulo;
        this.autor = autor;
        this.identificador = identificador;
        this.totalDeCopias = totalDeCopias;
        this.totalEmprestado = 0;
    }


}
