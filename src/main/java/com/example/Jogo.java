package com.example;

public class Jogo {

    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Computador computador = new Computador();

    public Jogo() {
        monte.embaralhar();
    }

    public Carta distribuirCartaParaJogador(Jogador jogador) {
        if (jogador.parou())
            return null;

        var carta = monte.virar();
        jogador.receberCarta(carta);
        return carta;

    }

    public boolean acabou(){
        //if semanticos
        var computadorEstourou = computador.getPontos() > 21;
        var jogadorEstourou = jogador.getPontos() > 21;
        var osDoisPararam = jogador.parou() && computador.parou();

        return osDoisPararam || jogadorEstourou || computadorEstourou;
    }

    public String resultado(){
        var empatou = jogador.getPontos() == computador.getPontos();
        var computadorEstourou = computador.getPontos() > 21;
        var jogadorEstourou = jogador.getPontos() > 21;
        var osDoisEstouraram = jogadorEstourou && computadorEstourou;
        var jogadorTemMaisPontos = jogador.getPontos() > computador.getPontos();

        if(empatou || osDoisEstouraram) return "Empatou";
        if(!jogadorEstourou && (computadorEstourou || jogadorTemMaisPontos)) return "Você ganhou";
        return "Você perdeu";
    }

}
