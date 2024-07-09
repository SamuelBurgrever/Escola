package com.alura.escola;

import com.alura.escola.aplicacao.indicacao.MatricularAluno;
import com.alura.escola.aplicacao.indicacao.MatricularAlunoDto;
import com.alura.escola.dominio.PublicadorDeEventos;
import com.alura.escola.dominio.aluno.LogDeAlunoMatriculado;
import com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {

    public static void main(String[] args) {
        String nome = "Fulano da Silva";
        String cpf = ("111.111.111-22");
        String email = ("fulano@email.com");

        MatricularAlunoDto dto = new MatricularAlunoDto(nome, cpf, email);

        PublicadorDeEventos publicador = new PublicadorDeEventos();
        publicador.adicionar(new LogDeAlunoMatriculado());

        MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), publicador);

        matricular.executa(dto);
    }

}
