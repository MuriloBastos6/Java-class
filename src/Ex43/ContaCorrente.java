package Ex43;

public class ContaCorrente extends Conta {
    private String limite;

    public ContaCorrente() {
        super();
    }


    public String getLimite() {
        return limite;
    }

    public void setLimite(String limite) {
        this.limite = limite;
    }

    public ContaCorrente(int id, String titular, double saldo, String conta, String agencia, String limite) {
        super(id, titular, saldo, conta, agencia);
        this.limite = limite;
    }

    @Override
    public void deposito(double valor) {
        super.deposito(valor);
    }

    public void sacar(double valor, int limite) {
        if (valor <= limite && valor > 0) {
            super.sacar(valor);
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Valor de saque esta fora do limite permitido.");
        }
    }
}


