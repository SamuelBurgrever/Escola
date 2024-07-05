package com.alura.escola.alunomatricular;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.alura.escola.aplicacao.indicacao.MatricularAluno;
import com.alura.escola.aplicacao.indicacao.MatricularAlunoDto;
import com.alura.escola.dominio.aluno.Aluno;
import com.alura.escola.dominio.aluno.Cpf;
import com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(new RepositorioDeAlunosEmMemoria());

        MatricularAlunoDto dados = new MatricularAlunoDto("Fulano", "111.111.111-22", "fulano@gmail.com");
        useCase.executa(dados);

        Aluno encontrado = repositorio.buscarPorCPF(new Cpf("111.111.111-22"));

        assertEquals("Fulano", encontrado.getNome());
        assertEquals("111.111.111-22", encontrado.getCpf());
        assertEquals("fulano@gmail.com", encontrado.getEmail());
    }

}
