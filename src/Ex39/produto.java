package Ex39;

public class produto {
    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public double getPreco() {
        return preco;
    }

    public void setValor(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    produto(int codigo, String nome, double preco, int quantidade){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void entradaEstoque(int quantidadeEntrada){
        this.quantidade = this.quantidade + quantidadeEntrada;
    }

    public void saidaEstoque(int quantidadeSaida){
        this.quantidade = this.quantidade - quantidadeSaida;
    }

}
