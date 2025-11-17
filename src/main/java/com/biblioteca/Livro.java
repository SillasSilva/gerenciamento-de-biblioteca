package com.biblioteca;

// A classe Livro herda de ItemBiblioteca e, portanto, se torna um tipo de ItemBiblioteca.
public class Livro extends ItemBiblioteca {
    // Atributos EXCLUSIVOS de Livro
    private String autor;

    // Construtor: recebe todos os dados, e usa super() para inicializar os herdados.
    public Livro(String titulo, String identificador, String autor, int totalDeCopias) {

        super(titulo, identificador, totalDeCopias);
        this.autor = autor;
        totalEmprestado = 0; // Um livro novo começa com 0 emprestado
    }

    // IMPLEMENTAÇÃO DO POLIMORFISMO: Define a regra do Livro
    @Override
    public int calcularPrazoDevolucaoDias() {
        return 15; // Prazo de devolução para Livros
    }

    // Lógica de Estoque

    public int getCopiasDisponiveis(){
        return this.totalDeCopias - this.totalEmprestado;
    }

    public String getAutor() {
        return autor;
    }

    public boolean emprestar() {
        if (getCopiasDisponiveis() > 0) {
            this.totalEmprestado ++;
            return true;
        } else {
            // Usa o getTitulo() que é herdado
            System.out.println("ERRO: Todas as cópias do livro  estão emprestadas.");
            return false;
        }
    }

    public boolean devolver() {
        if (this.totalEmprestado > 0 ) {
            this.totalEmprestado--;
            return true;
        } else {
            System.out.println("ERRO: Nenhuma cópia do livro estava emprestada.");
            return false;
        }
    }

    // Getters para os atributos próprios que não são herdados
    public int getTotalDeCopias() {
        return totalDeCopias;
    }
    public int getTotalEmprestado() {
        return totalEmprestado;
    }
}