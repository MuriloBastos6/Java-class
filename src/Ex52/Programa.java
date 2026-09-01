package Ex52;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, Produto> produtos = new HashMap<Integer, Produto>();
        Scanner ler = new Scanner(System.in);

        int opcao;
        int id;
        Produto pro;
        String possuiCat;
        int id_produto = 0;

        do {
            System.out.println("===> Sistema de Cadastro de Produtos <===");
            System.out.println("Escolha uma opção:\n");
            System.out.println("1 - Cadastrar \n" +
                    "2 - Excluir \n" +
                    "3 - Exibir \n" +
                    "4 - Sair\n\n");
            System.out.print("Digite a opção desejada: ");
            opcao = ler.nextInt();
            if (opcao == 1) {
                Produto produto = new Produto();

                id_produto++;
                produto.setId(id_produto);

                System.out.printf("Digite o nome do produto: ");
                produto.setNome(ler.next());
                System.out.printf("Digite o preço do produto: ");
                produto.setPreco(ler.nextDouble());
                System.out.printf("Digite a quantidade do produto: ");
                produto.setQuantidade(ler.nextDouble());

                System.out.print("Possui categoria? S/N");
                possuiCat = ler.next().toUpperCase();

                if (possuiCat.equals("S")) {
                    Categoria categoria = new Categoria();
                    System.out.print("Digite o nome da categoria: ");
                    categoria.setNome(ler.next());
                    produto.setCategoria(categoria);
                } else {
                    produto.setCategoria(null);
                }

                produtos.put(id_produto, produto);

                System.out.printf("Produto cadastrado com sucesso!\n");
                System.in.read();

            } else if (opcao == 2) {
                produtos.forEach((key, value) -> {
                    System.out.printf("ID: %d, Nome: %s, Preço: %.2f, Quantidade: %.2f\n", value.getId(), value.getNome(), value.getPreco(), value.getQuantidade());
                });

                System.out.printf("Digite o ID do produto que deseja excluir: ");
                id = ler.nextInt();

                if (produtos.containsKey(id)) {
                    produtos.remove(id);
                    System.out.printf("Produto excluído com sucesso!\n");
                } else {
                    System.out.printf("Produto não encontrado!\n");
                }
            } else if (opcao == 3) {
                produtos.forEach((key, value) -> {
                    System.out.println("ID: " + key + " - " + value.exibirNomePreco());

                    if (value.getCategoria() != null) {
                        System.out.println(value.exibirProdutoCategoria());
                    }
                });
                System.in.read();
            }

        } while (opcao >= 1 && opcao <= 3);

    }
}
