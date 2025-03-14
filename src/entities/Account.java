package entities;

public class Account {
    private int numeroConta;
    private String titular;
    private double saldo;

    public Account(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }
    public Account(int numeroConta, String titular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        deposito(depositoInicial);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void deposito(double quantidade) {
        this.saldo += quantidade;
    }

    public void saque(double quantidade) {
        this.saldo -= quantidade + 5.0;
    }

    public String toString() {
        return "Conta "
                + numeroConta
                + ", Titular: "
                + titular
                + ", Saldo: R$ "
                + String.format("%.2f", saldo);
    }
}
