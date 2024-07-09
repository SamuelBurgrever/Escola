package com.alura.escola.dominio.aluno;

import java.time.LocalDateTime;

import com.alura.escola.dominio.Evento;

public class AlunoMatriculado implements Evento {

    private final Cpf cpfAluno;
    private final LocalDateTime momento;

    public AlunoMatriculado(Cpf cpfAluno) {
        this.cpfAluno = cpfAluno;
        this.momento = LocalDateTime.now();
    }

    @Override
    public LocalDateTime momento() {
        return this.momento;
    }

    public Cpf getCpfAluno() {
        return cpfAluno;
    }

}
