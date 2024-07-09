package com.alura.escola.dominio.aluno;

import java.time.format.DateTimeFormatter;

public class LogDeAlunoMatriculado {

    public void reageAo(AlunoMatriculado evento) {

        String momentoFormatado = evento.momento().format(DateTimeFormatter.ofPattern("dd/mm/yyyy  hh:mm"));
        System.out.println(String.format("Aluno com CPF %s matriculado em: %s", evento.getCpfAluno(), momentoFormatado));
    }

}
