package olateste;

import static org.junit.Assert.*;

import org.junit.Test;

public class Pessoatest {

    @Test
    public void testDizerOla() {
        Pessoa pessoa = new Pessoa();
        String mensagem = pessoa.dizerOla();
        assertEquals("Olá, Mundo!", mensagem);
    }
}
