package org.example;

public abstract class Cartao {

    private float saldoConta;
    private float limiteCredito;
    private float valorCompra;

    public float getSaldoConta() { return saldoConta; }

    public void setSaldoConta(float saldoConta) { this.saldoConta = saldoConta; }

    public float getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(float limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public float getValorCompra() { return valorCompra;}

    public void setValorCompra(float valorCompra) { this.valorCompra = valorCompra;}

    public float ConfirmarValorCompra() {
        return (this.valorCompra);
    }

    public float ConfirmarSaldoConta() {
        return (this.saldoConta);
    }

    public abstract String verificarCompra();

}
