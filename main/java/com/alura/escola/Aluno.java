package com.alura.escola;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    private Cpf cpf;
    private Email email;

    private List<Telefone> telefones = new ArrayList<>();

    public Aluno(Cpf cpf, Email email, String nome) {
        this.cpf = cpf;
        this.email = email;
        this.nome = nome;
    }

    public void adicionarTelefone(String ddd, String numero) {
        this.telefones.add(new Telefone(ddd, numero));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public static void main(String[] args) {
        Aluno a = new Aluno(new Cpf("111.222.333-44"), new Email("fulano@gmail.com"), "Fulano da silva");
    }

}
