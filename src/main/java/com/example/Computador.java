package com.example;

public class Computador extends Jogador{
    @Override //evita d cometer erros quando escreve os metodos pra saber se ja tem o metodo parou por exemplo e n criar outro se tiver um nome diferente!
    public boolean parou() {
        return getPontos() > 16;
    }
}