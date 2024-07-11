package com.alura.escola.dominio.incicacao;

import java.time.LocalDateTime;

import com.alura.escola.dominio.aluno.Aluno;

public class Indicacao {

    private Aluno indicado;
    private Aluno indicante;
    private LocalDateTime dataIndicacao;

    public Indicacao(Aluno indicado, Aluno indicante) {
        this.indicado = indicado;
        this.indicante = indicante;
        this.dataIndicacao = LocalDateTime.now();
    }

    public Aluno getIndicado() {
        return indicado;
    }

    public Aluno getIndicante() {
        return indicante;
    }

    public LocalDateTime getDataIndicacao() {
        return dataIndicacao;
    }

}
