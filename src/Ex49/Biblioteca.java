package Ex49;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> acervo;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
        System.out.printf("Livro '%s' adicionado ao acervo.%n", livro.getTitulo());
    }

    public void exibirAcervo() {
        if (acervo.isEmpty()){
            System.out.println("A biblioteca esta vazia.");
            return;
        }
        System.out.println("----Acervo de livros na biblioteca----");
        for(Livro livro : acervo){
            System.out.println(livro.toString());
        }
        System.out.println("---------------------------------------");
    }



    private Livro buscarPorTitulo(String titulo) throws LivroNaoEncontradoException{
        for(Livro livro : acervo){
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                return livro;
            }
        }
        throw new LivroNaoEncontradoException("Livro não encontrado: " + titulo);
    }

    public void emprestarLivro(String titulo)throws LivroNaoEncontradoException, LivroEmprestadoException{
        Livro livro = buscarPorTitulo(titulo);
        if(!livro.isDisponivel()){
            throw new LivroNaoEncontradoException("Livro não disponível para empréstimo: " + titulo);
        }
        livro.setDisponivel(false);
        System.out.printf("Livro '%s' emprestado com sucesso.%n", titulo);
    }

    public void devolverLivro(String titulo) throws LivroNaoEncontradoException{
        Livro livro = buscarPorTitulo(titulo);
        if(livro.isDisponivel()){
            System.out.printf("Livro '%s' já está disponível na biblioteca.%n", titulo);
            return;
        }
        livro.setDisponivel(true);
        System.out.printf("Livro '%s' devolvido com sucesso.%n", titulo);

    }



}

