package Ex37;

public class Cliente {
    public String agencia;
    public String conta;
    public String nome;
    public Double saldo;

    Cliente(){
    }

    Cliente(String agencia, String conta, String nome, Double saldo){
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.nome = nome;
    }

    public void depositar (double Deposito){
        this.saldo = this.saldo + Deposito;
    }

    public void sacar (double ValorSaque){
        this.saldo = this.saldo - ValorSaque;
    }

    public double emitirSaldo(){
        return this.saldo;
    }
}