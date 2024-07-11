package com.alura.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.alura.escola.dominio.PublicadorDeEventos;
import com.alura.escola.dominio.aluno.Aluno;
import com.alura.escola.dominio.aluno.Cpf;
import com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        // MOCK -> Mockito
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();

        MatricularAluno useCase = new MatricularAluno(repositorio, new PublicadorDeEventos());

        MatricularAlunoDto dados = new MatricularAlunoDto(
                "Fulano",
                "123.456.789-00",
                "fulano@email.com");
        useCase.executa(dados);

        Aluno encontrado = repositorio.buscarPorCPF(
                new Cpf("123.456.789-00"));

        assertEquals("Fulano", encontrado.getNome());
        assertEquals(new Cpf("123.456.789-00"), encontrado.getCpf());
        assertEquals("fulano@email.com", encontrado.getEmail());
    }

}
