package Ex39;

import java.util.Scanner;

public class Programa {
    static void main() {
        Scanner ler = new Scanner(System.in);
        produto[] listaPrdoutos = new produto[10];
        int opcao, quantidade, codigo, codigo_produto = 0;
        String nome;
        double preco;

        while (true) {
            System.out.printf("===BOURACHED COMPANY===\n");
            System.out.printf("1 - Cadastrar produto\n");
            System.out.printf("2 - Dar Entrada Produto\n");
            System.out.printf("3 - Dar Saída Produto\n");
            System.out.printf("4 - Exibir Saldo Produto\n");
            System.out.printf("5 - Sair\n");
            System.out.printf("Digite sua opção: ");
            opcao = ler.nextInt();
            if (opcao == 1) {
                System.out.printf("Digite o nome do produto: ");
                nome = ler.next();
                System.out.printf("Digite o código do produto: ");
                codigo = ler.nextInt();
                System.out.printf("Digite o preço do produto: ");
                preco = ler.nextDouble();
                produto p = new produto(codigo, nome, preco, 0);
                listaPrdoutos[codigo_produto] = p;
            } else if (opcao == 2) {
                for (int i = 0; i < listaPrdoutos.length; i++) {
                    if (listaPrdoutos[i] != null) {
                        System.out.printf("Código: %d | Nome: %s | Preço: %.2f | Quantidade: %d\n", listaPrdoutos[i].getCodigo(), listaPrdoutos[i].getNome(), listaPrdoutos[i].getPreco(), listaPrdoutos[i].getQuantidade());
                    }
                    System.out.printf("Digite o código do produto para dar entrada: ");
                    codigo = ler.nextInt();
                    System.out.printf("Digite a quantidade para dar entrada: ");
                    quantidade = ler.nextInt();
                    listaPrdoutos[codigo_produto].entradaEstoque(quantidade);
                    System.out.printf("Entrada de %d unidades do produto %s realizada com sucesso!\n", quantidade, listaPrdoutos[codigo_produto].getNome());
                }
            } else if (opcao == 3) {
                for (int i = 0; i < listaPrdoutos.length; i++) {
                    if (listaPrdoutos[i] != null) {
                        System.out.printf("Código: %d | Nome: %s | Preço: %.2f | Quantidade: %d\n", listaPrdoutos[i].getCodigo(), listaPrdoutos[i].getNome(), listaPrdoutos[i].getPreco(), listaPrdoutos[i].getQuantidade());
                    }
                    System.out.printf("Digite o código do produto para dar saída: ");
                    codigo_produto = ler.nextInt();
                    System.out.printf("Digite a quantidade para dar saída: ");
                    quantidade = ler.nextInt();
                    if (quantidade <= listaPrdoutos[codigo_produto].getQuantidade()) {
                        listaPrdoutos[codigo_produto].saidaEstoque(quantidade);
                        System.out.printf("Saída de %d unidades do produto %s realizada com sucesso!\n", quantidade, listaPrdoutos[codigo_produto].getNome());
                    }
                }
            } else if (opcao == 4) {


            }
                else {
                    break;
                }
        }


        ler.close();
    }
}
