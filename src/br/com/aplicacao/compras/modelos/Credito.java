package br.com.aplicacao.compras.modelos;

public class Credito {
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public Credito() {
    }
    public Credito(double limite) {}

    public void calculoCredito(double valor) {
        this.limite = limite;
    }
}
