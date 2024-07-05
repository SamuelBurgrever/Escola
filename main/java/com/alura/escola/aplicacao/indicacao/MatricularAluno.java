package com.alura.escola.aplicacao.indicacao;

import com.alura.escola.dominio.aluno.Aluno;
import com.alura.escola.dominio.aluno.AlunoRepository;

public class MatricularAluno {

    private final AlunoRepository repositorio;

    public MatricularAluno(AlunoRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void executa(MatricularAlunoDto dados) {
        Aluno novo = dados.crirAluno();
        repositorio.matricular(novo);
    }
}
