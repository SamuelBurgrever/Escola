package com.alura.escola;

import com.alura.escola.dominio.aluno.Aluno;
import com.alura.escola.dominio.aluno.AlunoRepository;
import com.alura.escola.dominio.aluno.Cpf;
import com.alura.escola.dominio.aluno.Email;
import com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAluno {

    public static void main(String[] args) {
        String nome = "Fulano da Silva";
        Cpf cpf = new Cpf("111.222.333-44");
        Email email = new Email("fulano@email.com");

        Aluno aluno = new Aluno(cpf, email, nome);

        AlunoRepository repositorio = new RepositorioDeAlunosEmMemoria();
        repositorio.matricular(aluno);

    }

}
