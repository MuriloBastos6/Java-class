package bibliotecaDeLivros;

import java.util.Scanner;

public class Programa {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao,  isbn= 0, isbn_cod, ano;
        String titulo, autor;
        boolean disponivel;

        Livro[] livros = new Livro[10];

        while (true) {
            System.out.print("=== Biblioteca de Livros ===\n");
            System.out.print("1 - Cadastrar livro\n");
            System.out.print("2 - Emprestar livro\n");
            System.out.print("3 - Devolver livro\n");
            System.out.print("4 - Exibir disponibilidade do livro\n");
            System.out.print("5 - Sair\n");
            System.out.print("Digite sua opção: ");
            opcao = input.nextInt();


            if (opcao == 1) {

                System.out.print("Digite o titulo do livro: ");
                titulo = input.next();
                System.out.print("Digite o ano do livro: ");
                ano = input.nextInt();
                System.out.print("Digite o autor do livro: ");
                autor = input.next();

                Livro l = new Livro(isbn, titulo, ano, autor, true);
                livros[isbn] = l;
                isbn++;
                System.out.printf("Livro %s cadastrado com sucesso!\n", titulo);
            }
            else if (opcao == 2) {
                for (int i = 0; i < isbn; i++) {livros[i].exibirInfo();}
                System.out.println("Digite o ISBN do livro para emprestar: ");
                isbn_cod = input.nextInt();
                livros[isbn_cod].emprestarLivro(isbn_cod);
            }

            else if (opcao == 3) {
                for (int i = 0; i < isbn; i++) {livros[i].exibirInfo();}
                System.out.println("Digite o ISBN do livro para devolver: ");
                isbn_cod = input.nextInt();
                livros[isbn_cod].devolverLivro(isbn_cod);
            }

            else if (opcao == 4) {
                for (int i = 0; i < isbn; i++) {livros[i].exibirInfo();}
            }
            else {
                break;
            }
        }

    }
}
