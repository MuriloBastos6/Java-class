package teste;

public class cliente01{
    public int id;
    public String nome;
    public double saldo;

    cliente01(){

    }

    cliente01(int id, String nome, double saldo){
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String exibirIdNome() {
        return (this.id + " - " + this.nome);
    }

    public void depositar(double valorDeposito) {
        this.saldo = this.saldo + valorDeposito;
    }

    public String exibirNomeSaldo(int opcao) {
        String texto;

        if (opcao == 1)
            texto = this.nome + " - R$ " + this.saldo;
        else
            texto = this.nome + " - US$ " + (this.saldo / 4.70);

        return texto;
    }
}
