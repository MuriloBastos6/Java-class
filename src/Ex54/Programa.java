package Ex54;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws IOException {
       ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        Scanner ler = new Scanner(System.in);

        int opcao;
        int id;
        String possuiConta;
        int id_cliente = 0;

        do {
            System.out.printf("===> Sistema de Cadastro de Clientes <===\n\n");
            System.out.printf("Escolha uma opção:\n");
            System.out.printf("1 - Incluir \n" +
                    "2 - Atualizar \n" +
                    "3 - Excluir \n" +
                    "4 - Exibir \n" +
                    "5 - Sair\n\n");


            System.out.printf("Digite a opção desejada: ");
            opcao = ler.nextInt();


            if (opcao == 1) {
                Cliente cliente = new Cliente();


                id_cliente++;
                cliente.setId(id_cliente);


                System.out.print("Digite o seu nome: ");
                cliente.setNome(ler.next());


                System.out.print("Digite a seu idade: ");
                cliente.setIdade(ler.nextInt());


                System.out.print("Digite o seu e-mail: ");
                cliente.setEmail(ler.next());


                System.out.print("Possui conta bancária? S/N");
                possuiConta = ler.next().toUpperCase();


                if (possuiConta.equals("S")) {
                    ContaBancaria conta = new ContaBancaria();


                    System.out.print("Digite a agencia: ");
                    conta.setAgencia(ler.next());


                    System.out.print("Digite o numero: ");
                    conta.setNumero(ler.next());


                    conta.setSaldo(0);


                    cliente.setConta(conta);
                }

                else {
                cliente.setConta(null);
                }


                clientes.add(cliente);


                System.out.printf("Cliente incluído com sucesso!");
                System.in.read();
            }
           else if (opcao == 2) {
            for(Cliente c : clientes)  {
                System.out.println("ID: " + c.getId() + " - " + c.exibirNomeIdade());
            };


            System.out.print("Digite o ID do cliente que você deseja atualizar: ");
            id = ler.nextInt();

            Cliente cli = null;
                for(Cliente c : clientes){
                    if(c.getId() == id){
                        cli = c;
                        break;
                    }
                }


            if (cli != null) {


                System.out.print("Digite o seu novo nome: ");
                cli.setNome(ler.next());


                System.out.print("Digite a sua nova idade: ");
                cli.setIdade(ler.nextInt());


                System.out.print("Digite o seu novo e-mail: ");
                cli.setEmail(ler.next());


                System.out.printf("Cliente atualizado com sucesso!");
            } else {
                System.out.printf("Cliente não encontrado!");
            }
            System.in.read();
        } else if (opcao == 3) {
           for(Cliente c : clientes){
                System.out.println("ID: " + c.getId() + " - " + c.exibirNomeIdade());
            };


            System.out.print("Digite o ID do cliente que você deseja excluir: ");
            id = ler.nextInt();

            int indiceRemover = -1;
                for (int i =0; i < clientes.size(); i++){
                    if (clientes.get(i).getId() == id){
                        indiceRemover = i;
                        break;
                    }
            }


            if (indiceRemover!= -1) {
                clientes.remove(indiceRemover);
                System.out.printf("Cliente excluído com sucesso!");
            } else
                System.out.printf("Cliente não encontrado!");


            System.in.read();
        } else if (opcao == 4) {
            for(Cliente c : clientes) {
                System.out.println("ID: " + c.getId() + " - " + c.exibirNomeIdade());


                if (c.getConta() != null)
                    System.out.println(c.exibirDadosConta());
            };


            System.in.read();
        }


        }while((opcao >=1)&&(opcao <=4));
    }
}


