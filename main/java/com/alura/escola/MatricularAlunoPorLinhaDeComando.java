package com.alura.escola;

import com.alura.escola.aplicacao.indicacao.MatricularAluno;
import com.alura.escola.aplicacao.indicacao.MatricularAlunoDto;
import com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {

    public static void main(String[] args) {
        String nome = "Fulano da Silva";
        String cpf = ("111.111.111-22");
        String email = ("fulano@email.com");

        MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        matricular.executa(new MatricularAlunoDto(nome, cpf, email));
    }

}
