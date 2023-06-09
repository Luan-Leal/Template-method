package org.example;

public class CartaoDebito extends Cartao {

    public String verificarCompra() {
        if (this.ConfirmarValorCompra() <= this.getSaldoConta()) {
            return "Compra Aprovada";
        }
        else {
            return "Compra Recusada";
        }
    }

}
