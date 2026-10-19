package com.gamevault.backend.model;

import jakarta.persistence.Entity;

public class @Entity Jogo {

    private String titulo;
    private double preco;
    private int estoque;

    public Jogo(String titulo, double preco, int estoque) {
        this.titulo = titulo;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void vender(int quantidade) {
        if (quantidade > estoque ) {
            System.out.println("Estoque insuficiente");
            return;
        }
        estoque -= quantidade;
    }
    public void repor(int quantidade) {
        estoque += quantidade;
    }
}
