package com.alura.escola.infra.selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.alura.escola.dominio.aluno.Cpf;
import com.alura.escola.dominio.selo.RepositorioDeSelos;

import com.alura.escola.dominio.selo.Selo;

public class RepositorioDeSelosEmMemoria implements RepositorioDeSelos {

    private List<Selo> selos = new ArrayList<>();

    @Override
    public void adicionar(Selo selo) {
        this.selos.add(selo);
    }

    @Override
    public List<Selo> selosDoAlunoDeCPF(Cpf cpf) {
        return this.selos.stream().filter(s -> s.getCpfDoAluno().collect(Collectors.toList()));
    }

}
