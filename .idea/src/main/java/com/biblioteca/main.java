package com.biblioteca;

public class main {
    public static void main (String[] args) {
        Livro l1 = new Livro("pai rico e pai pobre", "robert", "wwee", 10);

        System.out.println("tinhamos em estoque" + l1.getCopiasDisponiveis() + " do livro: " + l1.getTitulo());
        l1.emprestar();
        System.out.println("mas agora temos apenas: " + l1.getCopiasDisponiveis() + "porque pegaram: " + l1.getTotalEmprestado());
    }

}
