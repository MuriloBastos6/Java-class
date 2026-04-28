package Exemplo39;

import java.util.Scanner;

public class Programa {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao, cod=0, cod_produto, quantidade;
        String nome;
        double preco;

        Produto[] Produtos = new Produto[3];

        while(true){
            System.out.printf("===BOURACHED COMPANY===\n");
            System.out.printf("1 - Cadastrar produto\n");
            System.out.printf("2 - Dar Entrada Produto\n");
            System.out.printf("3 - Dar Saída Produto\n");
            System.out.printf("4 - Exibir Saldo Produto\n");
            System.out.printf("5 - Sair\n");

            System.out.println("Digite sua opção: ");
            opcao = sc.nextInt();

            if(opcao == 1){
                System.out.println("Digite o nome do produto: ");
                nome = sc.next();
                System.out.println("Digite o preço do produto: ");
                preco = sc.nextDouble();

                Produto p = new Produto(cod, nome, preco, 0);
                Produtos[cod] = p;
                cod++;
                System.out.printf("Produto %s cadastrado com sucesso!\n", nome);

            } else if (opcao == 2) {
                for (int i = 0; i <cod; i++){
                    System.out.printf("Código: %d | Nome: %s | Preço: %.2f \n", Produtos[i].getCodigo(), Produtos[i].getNome(), Produtos[i].getPreco());
                }
                System.out.printf("Digite o código do produto para dar entrada: ");
                cod_produto = sc.nextInt();
                System.out.printf("Digite a quantidade para dar entrada: ");
                quantidade = sc.nextInt();
                Produtos[cod_produto].entradaProdutos(quantidade);
                System.out.printf("Entrada de %d unidades do produto %s realizada com sucesso!\n", quantidade, Produtos[cod_produto].getNome());

            } else if (opcao == 3) {
                for (int i = 0; i <cod; i++){
                    System.out.printf("Código: %d | Nome: %s | Preço: %.2f \n", Produtos[i].getCodigo(), Produtos[i].getNome(), Produtos[i].getPreco());
                }
                System.out.printf("Digite o código do produto para ser feita a retirada:");
                cod_produto = sc.nextInt();
                System.out.printf("Digite a quantidade para dar saída: ");
                quantidade = sc.nextInt();
                Produtos[cod_produto].saqueProduto(quantidade);;
            } else if (opcao == 4) {
                for (int i = 0; i <cod; i++){
                    System.out.println(Produtos[i].relatorioProdutos());
                }
            } else{
                break;
            }
        }
        sc.close();
    }
}
