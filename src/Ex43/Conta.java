package Ex43;

public class Conta {
    private int id;
    private String titular;
    private double saldo;
    private String conta;
    private String agencia;
    private String extrato;

    public Conta() {

    }

    public String getExtrato() {
        return extrato;
    }

    public void setExtrato(String extrato) {
        this.extrato = extrato;
    }


    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Conta(int id, String titular, double saldo, String conta, String agencia) {
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
        this.conta = conta;
        this.agencia = agencia;
        this.extrato = "";
    }

    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            this.extrato += "Adicionou R$ " + valor + "\n";
            System.out.printf("Depósito de R$ %.2f realizado com sucesso! Novo saldo: R$ %.2f\n", valor, this.saldo);

        } else {
            System.out.println("Valor de depósito inválido! O valor deve ser maior que zero.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 || valor >= saldo) {
            this.saldo -= valor;
            this.extrato += "Remouveu R$ " + valor + "\n";
        }
        else {
            System.out.println("Valor de saque inválido! O valor deve ser maior que zero e menor ou igual ao saldo disponível.");
        }
    }
}
