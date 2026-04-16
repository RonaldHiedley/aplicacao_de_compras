package br.com.aplicacao.compras.modelos;

public class Credito {
    private double limite;

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public Credito(double limite) {
        this.limite = limite;
    }

    public boolean calculoCompra(Compras compras) {
        if(this.limite >= compras.getValor() ){
            this.limite -= compras.getValor();
            return true;
        } return false;
    }
}
