package com.biblioteca;

public class main {
    public static void main (String[] args) {
        Biblioteca minhaBiblioteca = new Biblioteca();

        Livro livro1 = new Livro("Cachorro com dó", "22ERERE", "Malrinelson", 10);
        Livro livro2 = new Livro("gato com dó", "2323EE", "BRAGOX", 10);
        Revista revista1 = new Revista("Blaxter", "BLEIBLRIDE", 9);
        Revista revista2 = new Revista("gralex", "sdfs", 8);


        minhaBiblioteca.adicionarItem(livro1);
        minhaBiblioteca.adicionarItem(livro2);
        minhaBiblioteca.adicionarItem(revista1);
        minhaBiblioteca.adicionarItem(revista2);

        minhaBiblioteca.buscarItemPorTitulo("Blaxter");


        minhaBiblioteca.listarPrazosDevolucao();





    }

}
