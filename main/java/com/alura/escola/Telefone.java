package com.alura.escola;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if (ddd == null || ddd.matches("d{2}")) {
            throw new IllegalArgumentException("ddd inválido");

        } else if (numero == null || numero.matches("d{9}")) {
            throw new IllegalArgumentException("Número inválido");
        }
        this.ddd = ddd;
        this.numero = numero;
    }

}
