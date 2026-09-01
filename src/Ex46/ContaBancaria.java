package Ex46;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso! Saldo atual: R$ %.2f%n", valor, this.saldo);
        }
    }

    public void sacar(double valor) throws SaldoInsulficienteException {
        if (valor > this.saldo) {
            throw new SaldoInsulficienteException(String.format("Saldo insuficiente! Tentativa de saque: R$ %.2f | Saldo disponível: R$ %.2f", valor, this.saldo));
        }
        this.saldo -= valor;
        System.out.printf("Saque de R$ %.2f realizado com sucesso! Saldo atual: R$ %.2f%n", valor, this.saldo);
    }
}
