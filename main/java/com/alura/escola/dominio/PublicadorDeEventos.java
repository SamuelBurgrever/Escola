package com.alura.escola.dominio;

import java.util.ArrayList;
import java.util.List;

public class PublicadorDeEventos {

    private List<Ouvinte> ouvintes = new ArrayList<>();

    public void adicionar(Ouvinte ouvinte) {
        this.ouvintes.add(ouvinte);
    }

    public void publicar(Evento evento) {
        this.ouvintes.forEach(O -> {
            O.processa(evento);
        });
    }
}
