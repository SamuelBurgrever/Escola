package com.alura.escola.dominio.selo;

import java.util.List;

import com.alura.escola.dominio.aluno.Cpf;

public interface RepositorioDeSelos {

    void adicionar(Selo selo);

    List<Selo> selosDoAlunoDeCPF(Cpf cpf);

}
