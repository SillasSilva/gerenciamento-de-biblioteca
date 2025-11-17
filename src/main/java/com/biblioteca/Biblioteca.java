package com.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    // Polimorfismo: A lista armazena o tipo PAI (ItemBiblioteca)
    private List<ItemBiblioteca> itens;

    public Biblioteca() {
        this.itens = new ArrayList<>();
    }

    // Adiciona qualquer item (Livro ou Revista)
    public void adicionarItem(ItemBiblioteca item) {
        this.itens.add(item);
        System.out.println("✅ Item '" + item.getTitulo() + "' adicionado com sucesso.");
    }

    // Busca Linear Polimórfica
    public ItemBiblioteca buscarItemPorTitulo(String titulo) {
        for (ItemBiblioteca item : this.itens) {
            // Usa .equalsIgnoreCase() para buscar sem distinção de maiúsculas/minúsculas
            if (item.getTitulo().equalsIgnoreCase(titulo)) {
                return item;// Encontrado!
            }
        }
        return null; // Não encontrado
    }

    // Método que demonstra o Polimorfismo (diferentes resultados do mesmo método)
    public void listarPrazosDevolucao() {
        System.out.println("\n--- Prazos de Devolução ---\n");
        for (ItemBiblioteca item : itens) {
            System.out.println("Título: " + item.getTitulo() +
                    " | Prazo: " + item.calcularPrazoDevolucaoDias() + " dias.");
        }
        System.out.println("---------------------------\n");
    }

    public boolean devolverItem(String titulo) {
        ItemBiblioteca item = buscarItemPorTitulo(titulo);
        if (item == null) {
            System.out.println("Erro! " + titulo + "não existe em nossa biblioteca");
            return false;
        }
        if (item instanceof Livro livro) {
            if (livro.devolver()) {
                System.out.println(livro.getTitulo() + "devolvido com sucesso!");
                return true;
            } else {
                System.out.println("Erro, o livro " + livro.getTitulo() + "não pode ser devolvido");
                return  false;
            }
        }

        return false;
    }
}