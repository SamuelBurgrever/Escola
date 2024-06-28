package com.alura.escola;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CpfTest {

    @Test
    void naoDeveriaCriarCPFComNumerosInvalidos() {

        assertThrows(IllegalArgumentException.class, () -> new Cpf(null));

        assertThrows(IllegalArgumentException.class, () -> new Cpf(""));

        assertThrows(IllegalArgumentException.class, () -> new Cpf("12345678900"));
    }

    @Test
    void deveriaPermitirCriarCPFComNumerosValidos() {
        String cpf = "111.222.333-44";
        Cpf cpfTeste = new Cpf(cpf);

        assertEquals(cpf, cpfTeste.getCpf());

    }

}
