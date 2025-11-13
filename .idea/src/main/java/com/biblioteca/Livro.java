package com.biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private String identificador;
    private int totalDeCopias;
    private int totalEmprestado;

    public Livro(String titulo, String autor,String identificador, int totalDeCopias) {
        this.titulo = titulo;
        this.autor = autor;
        this.identificador = identificador;
        this.totalDeCopias = totalDeCopias;
        this.totalEmprestado = 0;
    }

    public int getCopiasDisponiveis(){
        return this.totalDeCopias - this.totalEmprestado;
    }

    public String getAutor() {
        return autor;
    }


    public String getTitulo() {
        return titulo;
    }


    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }


    public void setTotalDeCopias(int totalDeCopias) {
        this.totalDeCopias = totalDeCopias;
    }

    public int getTotalEmprestado() {
        return totalEmprestado;
    }

    public void setTotalEmprestado(int totalEmprestado) {
        this.totalEmprestado = totalEmprestado;
    }

    public boolean emprestar() {
        if (getCopiasDisponiveis() > 0) {
            this.totalEmprestado ++;
            return true;
        } else {
            System.out.println("todas a copias do livro: " + titulo + " foram emprestadas :(");
            return false;
        }

    }

    public boolean devolver() {
        if (this.totalEmprestado > 0 ) {
            this.totalEmprestado--;
            return true;
        } else {
            System.out.println("você não pegou este livro em nossa biblioteca :)");
            return false;
        }
    }
}
