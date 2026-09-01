package Ex43;

public class ContaPoupanca extends Conta {
    private int rendimento;

    public ContaPoupanca() {

    }

    public int getRendimento() {
        return rendimento;
    }

    public void setRendimento(int rendimento) {
        this.rendimento = rendimento;
    }

    public ContaPoupanca(int id, String titular, double saldo, String conta, String agencia, int rendimento) {
        super(id, titular, saldo, conta, agencia);
        this.rendimento = rendimento;
    }
}
