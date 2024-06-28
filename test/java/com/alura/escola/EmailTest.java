package com.alura.escola;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos() {

        assertThrows(IllegalArgumentException.class, () -> new Email(null));

        assertThrows(IllegalArgumentException.class, () -> new Email(""));

        assertThrows(IllegalArgumentException.class, () -> new Email("emailinvalido"));

    }

    @Test
    void deveriaPermitirCriarEmailComEnderecosValidos() {

        String endereco = "fulando@gmail.com";

        Email email = new Email(endereco);
        assertEquals(endereco, email.getEndereco());
    }
}
