package Atividade3.Classe;

public class Saldo {

    private double saldo;
    private double saldoReajustado;

    public Saldo(double saldo) {
        this.saldo = saldo;
        this.saldoReajustado = saldo += (saldo * 0.01);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoReajustado() {
        return saldoReajustado;
    }

    public void setSaldoReajustado(double saldoReajustado) {
        this.saldoReajustado = saldoReajustado;
    }

    public double imprimeSaldo(double valor) {
        return valor;
    }

}
