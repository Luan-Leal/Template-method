package org.example;

public class CartaoCredito extends Cartao {

    public String verificarCompra() {
        if (this.ConfirmarValorCompra() <= this.getLimiteCredito()) {
            return "Compra Aprovada";
        }
        else {
            return "Compra Recusada";
        }
    }

}
