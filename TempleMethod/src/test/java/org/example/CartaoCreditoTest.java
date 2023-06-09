package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartaoCreditoTest {

    @Test
    void deveRetonarCompraComCartaoDeCreditoAprovada() {
        CartaoCredito cartao = new CartaoCredito();
        cartao.setValorCompra(10.0f);
        cartao.setLimiteCredito(20.0f);
        assertEquals("Compra Aprovada", cartao.verificarCompra());
    }

    @Test
    void deveRetonarCompraComCartaoDeCreditoRecusada() {
        CartaoCredito cartao = new CartaoCredito();
        cartao.setValorCompra(10.0f);
        cartao.setLimiteCredito(9.0f);
        assertEquals("Compra Recusada", cartao.verificarCompra());
    }
}