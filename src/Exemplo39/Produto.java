package Exemplo39;

public class Produto {
    private String nome;
    private int codigo;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }



    Produto(int codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void entradaProdutos(int quantidade){
        if (quantidade > 0){this.quantidade += quantidade;}
        else {System.out.println("Quantidade inválida para entrada!");}
    }

    public void saqueProduto(int quantidade){
        if ( quantidade > 0 &&  quantidade < this.quantidade){this.quantidade = this.quantidade - quantidade;
            System.out.printf("Saída de %d unidades do produto %s realizada com sucesso!\n", quantidade, this.nome);}
        else {System.out.println("Quantidade inválida para saída!");}
    }

    public String relatorioProdutos(){
        return String.format("Código: %d | Nome: %s | Preço: %.2f | Quantidade: %d", this.codigo, this.nome, this.preco, this.quantidade);
    }
}

