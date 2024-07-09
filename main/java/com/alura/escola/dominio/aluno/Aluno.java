package com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    private Cpf cpf;
    private Email email;

    private List<Telefone> telefones = new ArrayList<>();

    private String senha;

    public Aluno(Cpf cpf, Email email, String nome) {
        this.cpf = cpf;
        this.email = email;
        this.nome = nome;
    }

    public void adicionarTelefone(String ddd, String numero) {
        if (telefones.size() == 2) {
            throw new IllegalArgumentException("Números maximo de telefones já atingido");
        }
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

    public String getEmail() {
        return email.getEndereco();
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
        Aluno a = new Aluno(new Cpf("111.111.111-22"), new Email("fulano@gmail.com"), "Fulano da silva");
    }

}
