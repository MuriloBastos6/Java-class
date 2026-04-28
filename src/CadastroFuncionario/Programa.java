package CadastroFuncionario;

import java.util.Scanner;

public class Programa {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        funcionario[] funcionarios = new funcionario[3];
        int id = 0, opcao, id_fun;
        String nome, cargo;
        double salario;

        while (true) {
            System.out.printf("=== Cadastro de Funcionários ===\n");
            System.out.printf("1 - Cadastrar funcionário\n");
            System.out.printf("2 - Exibir ficha do funcionário\n");
            System.out.printf("3 - Aumentar salário do funcionário\n");
            System.out.printf("4 - Sair\n");
            System.out.printf("Digite sua opção: ");
            opcao = input.nextInt();

            if (opcao == 1) {
                    System.out.print("Digite seu nome:");
                    nome = input.next();
                    System.out.print("Digite seu salario:");
                    salario = input.nextDouble();
                    System.out.print("Digite seu cargo:");
                    cargo = input.next();

                    funcionario f = new funcionario(id, nome, cargo, salario);
                    funcionarios[id] = f;
                    id++;
                }
            else if (opcao == 2) {
                for (int i = 0; i < id; i++) {funcionarios[i].exibirFicha();}
            }
            else if (opcao == 3) {
                for (int i = 0; i < id; i++) {funcionarios[i].exibirFicha();}
                System.out.printf("Digite o ID do funcionário para aumentar o salário: ");
                id_fun = input.nextInt();
                System.out.printf("Digite o percentual de aumento: ");
                salario = input.nextDouble();
                funcionarios[id_fun].aumentarSalario(salario);
                System.out.printf("Salário do funcionário %s aumentado com sucesso!\n", funcionarios[id_fun].getNome());
            }
        }
    }
}

