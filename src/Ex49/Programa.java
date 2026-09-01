package Ex49;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        boolean rodando = true;


        System.out.println("Bem-vindo ao Sistema da Mini-Biblioteca!");


        while (rodando) {
            try {
                System.out.println("\n===== MENU PRINCIPAL =====");
                System.out.println("1. Adicionar Livro");
                System.out.println("2. Emprestar Livro");
                System.out.println("3. Devolver Livro");
                System.out.println("4. Ver Acervo");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");


                int opcao = scanner.nextInt();
                scanner.nextLine(); // Limpeza do buffer do enter (MUITO IMPORTANTE!)


                switch (opcao) {
                    case 1:
                        System.out.print("Digite o título do livro: ");
                        String tituloAdd = scanner.nextLine();
                        biblioteca.adicionarLivro(new Livro(tituloAdd));
                        break;
                    case 2:
                        System.out.print("Digite o título do livro que deseja emprestar: ");
                        String tituloEmp = scanner.nextLine();
                        // Pode lançar LivroNaoEncontradoException ou LivroEmprestadoException
                        biblioteca.emprestarLivro(tituloEmp);
                        break;
                    case 3:
                        System.out.print("Digite o título do livro que deseja devolver: ");
                        String tituloDev = scanner.nextLine();
                        // Pode lançar LivroNaoEncontradoException
                        biblioteca.devolverLivro(tituloDev);
                        break;
                    case 4:
                        biblioteca.exibirAcervo();
                        break;
                    case 5:
                        rodando = false;
                        System.out.println("Encerrando o sistema... Até logo!");
                        break;
                    default:
                        System.out.println("Opção inválida! Escolha um número entre 1 e 5.");
                }


            } catch (InputMismatchException e) {
                System.out.println("\n[ERRO DE ENTRADA] Digite apenas números inteiros para o menu!");
                scanner.nextLine(); // Limpa o buffer com o texto incorreto digitado pelo usuário
            } catch (LivroNaoEncontradoException e) {
                System.out.println("\n[SISTEMA - ALERTA] " + e.getMessage());
            } catch (LivroEmprestadoException e) {
                System.out.println("\n[SISTEMA - ALERTA] " + e.getMessage());
            } catch (Exception e) {
                // Captura qualquer outro erro inesperado para garantir que o sistema não trave
                System.out.println("\n[ERRO DESCONHECIDO] Ocorreu um problema inesperado: " + e.getMessage());
            }
        }


        scanner.close();
    }
}


