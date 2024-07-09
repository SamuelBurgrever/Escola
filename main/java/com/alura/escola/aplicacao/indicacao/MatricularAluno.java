package com.alura.escola.aplicacao.indicacao;

import com.alura.escola.dominio.PublicadorDeEventos;
import com.alura.escola.dominio.aluno.Aluno;
import com.alura.escola.dominio.aluno.AlunoMatriculado;
import com.alura.escola.dominio.aluno.AlunoRepository;
import com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAluno {

    private final AlunoRepository repositorio;
    private final PublicadorDeEventos publicador;

    public MatricularAluno(AlunoRepository repositorio, PublicadorDeEventos publicador) {
        this.repositorio = repositorio;
        this.publicador = publicador;
    }

    public MatricularAluno(RepositorioDeAlunosEmMemoria repositorioDeAlunosEmMemoria, PublicadorDeEventos publicador) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void executa(MatricularAlunoDto dados) {
        Aluno novo = dados.crirAluno();
        repositorio.matricular(novo);

        AlunoMatriculado evento = new AlunoMatriculado(novo.getCpf());
        publicador.publicar(evento);
    }
}
