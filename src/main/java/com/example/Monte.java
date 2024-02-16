package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monte {
    private List<Carta> cartas = new ArrayList<>();

    public Monte(){
        //for each, pq pega um array d elemento e repete pra cada elemento do array
        for (Naipe naipe : Naipe.values()){

            for (int i = 1; i <= 13; i++){
                cartas.add(new Carta(i, naipe));
            }
        }
    }
    public void embaralhar(){
        Collections.shuffle(cartas);
    }
    public Carta virar(){
        //metodo remove(), remove a carta e já a retorna
        return cartas.remove(0);
    }
}
