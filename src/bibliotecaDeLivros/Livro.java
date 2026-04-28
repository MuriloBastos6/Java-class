package bibliotecaDeLivros;

public class Livro {
    private int isbn;
    private String titulo;
    private int anoPublicacao;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    private String autor;
    private boolean disponivel;

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }


    Livro(int isbn, String titulo, int anoPublicacao, String autor, boolean disponivel) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public void emprestarLivro(int ibns_cod) {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.printf("O livro %s foi emprestado com sucesso!\n", this.titulo);
        } else {
            System.out.printf("O livro %s não está disponível para empréstimo!\n", this.titulo);
        }
    }

    public void devolverLivro(int ibns_cod) {
        if (!this.disponivel) {
            this.disponivel = true;
            System.out.printf("O livro %s foi devolvido com sucesso!\n", this.titulo);
        }
        else {
            System.out.printf("O livro %s já está disponível na biblioteca!\n", this.titulo);
        }
    }

    public void exibirInfo(){
        System.out.printf("=== Informações do Livro ===\n");
        System.out.printf("ISBN: %d, Título: %s, Ano de Publicação: %d, Autor: %s Disponibilidade: %s\n", this.isbn, this.titulo, this.anoPublicacao, this.autor, this.disponivel ? "Disponivel" : "Emprestado");
        System.out.printf("============================\n");
    }

}
