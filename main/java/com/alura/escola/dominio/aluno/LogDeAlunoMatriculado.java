package com.alura.escola.dominio.aluno;

import java.time.format.DateTimeFormatter;

import com.alura.escola.dominio.Evento;
import com.alura.escola.dominio.Ouvinte;

public class LogDeAlunoMatriculado extends Ouvinte {

    public void reageAo(Evento evento) {

        String momentoFormatado = evento.momento().format(DateTimeFormatter.ofPattern("dd/mm/yyyy  hh:mm"));
        System.out.println(String.format("Aluno com CPF %s matriculado em: %s", ((AlunoMatriculado) evento).getCpfAluno(), momentoFormatado));
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento instanceof AlunoMatriculado;
    }

}
