package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartaoDebitoTest {

    @Test
    void deveRetonarCompraComCartaoDeDebitoAprovada() {
        CartaoDebito cartao = new CartaoDebito();
        cartao.setValorCompra(10.0f);
        cartao.setSaldoConta(20.0f);
        assertEquals("Compra Aprovada", cartao.verificarCompra());
    }

    @Test
    void deveRetonarCompraComCartaoDeDebitoReprovada() {
        CartaoDebito cartao = new CartaoDebito();
        cartao.setValorCompra(10.0f);
        cartao.setSaldoConta(9.0f);
        assertEquals("Compra Recusada", cartao.verificarCompra());
    }
}