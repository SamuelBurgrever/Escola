package com.alura.escola.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import com.alura.escola.dominio.aluno.Aluno;
import com.alura.escola.dominio.aluno.AlunoNaoEncontrado;
import com.alura.escola.dominio.aluno.Cpf;
import com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

    private List<Aluno> matriculados = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno) {
        this.matriculados.add(aluno);
    }

    @Override
    public Aluno buscarPorCPF(Cpf cpf) {
        return this.matriculados.stream()
                .filter(a -> a.getCpf().equals(cpf))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontrado(cpf));
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return this.matriculados;
    }

}
