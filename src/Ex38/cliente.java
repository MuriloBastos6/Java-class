package Ex38;

public class cliente {
    private String conta;
    private Double saldo;


    private double limite;
    private String nome;
    private String agencia;
    private String historico;

    public String getHistorico() {
        return historico;
    }

    public void getLimite(double limite) {
        this.limite = limite;
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

    public Double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    cliente(String agencia, String conta, String nome, Double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.nome = nome;
        this.limite = 50;
        this.historico = "";
    }

    public void depositar (double Deposito){
        this.saldo = this.saldo + Deposito;
        this.historico += "+ R$" + Deposito + "\n";
    }

    public void sacar (double ValorSaque){
        this.saldo = this.saldo - ValorSaque;
        this.historico += "- R$" + ValorSaque + "\n";
    }

    public double emitirSaldo(){
        return this.saldo;
    }

    public void transferir(double valor, cliente destinatario){
        this.sacar(valor);
        destinatario.depositar(valor);
    }

    public String extrato(){
        return this.historico;
    }


}
