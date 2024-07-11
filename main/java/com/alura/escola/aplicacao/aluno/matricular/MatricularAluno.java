package com.alura.escola.aplicacao.aluno.matricular;

import com.alura.escola.dominio.PublicadorDeEventos;
import com.alura.escola.dominio.aluno.Aluno;
import com.alura.escola.dominio.aluno.AlunoMatriculado;
import com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorio;
    private final PublicadorDeEventos publicador;

    public MatricularAluno(RepositorioDeAlunos repositorio, PublicadorDeEventos publicador) {
        this.repositorio = repositorio;
        this.publicador = publicador;
    }

    public void executa(MatricularAlunoDto dados) {
        Aluno novo = dados.criarAluno();
        repositorio.matricular(novo);

        AlunoMatriculado evento = new AlunoMatriculado(novo.getCpf());
        publicador.publicar(evento);
    }

}
