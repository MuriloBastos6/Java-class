package Ex38;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        cliente[] listaClientes = new cliente[10];

        int opcao, id=0, id_cliente, id_cliente_dest;
        String nome, agencia, conta;
        double Valor;


        while(true){
            System.out.println("===BATATA BANK===");
            System.out.println("1- Cadastrar Cliente");
            System.out.println("2- Depositar");
            System.out.println("3- Sacar");
            System.out.println("4- Transferencia");
            System.out.println("5- Emitir Saldo");
            System.out.println("6- Historico");
            System.out.println("7- Sair");

            System.out.printf("Digite sua opção: ");
            opcao = ler.nextInt();

            if (opcao == 1){
                cliente c;
                System.out.println("Digite o nome do cliente: ");
                nome = ler.next();
                System.out.println("Digite a agência do cliente: ");
                agencia = ler.next();
                System.out.println("Digite a conta do cliente: ");
                conta = ler.next();

                c  = new cliente(agencia, conta, nome, 0.0);
                listaClientes[id] = c;
                id++;
            } else if (opcao == 2) {
                for (int i = 0; i < id; i++){
                    System.out.printf("Id: %d | Agencia: %s | Conta: %s | Nome: %s | Saldo: %.2f\n", i, listaClientes[i].getAgencia(), listaClientes[i].getConta(), listaClientes[i].getNome(), listaClientes[i].getSaldo());
                }
                System.out.printf("Digite o id do cliente para realizar o depósito: ");
                id_cliente = ler.nextInt();
                System.out.printf("Digite o valor do depósito: ");
                Valor = ler.nextDouble();
                listaClientes[id_cliente].depositar(Valor);
            } else if (opcao == 3) {
                for (int i = 0; i < id; i++){
                    System.out.printf("Id: %d | Agencia: %s | Conta: %s | Nome: %s | Saldo: %.2f\n", i, listaClientes[i].getAgencia(), listaClientes[i].getConta(), listaClientes[i].getNome(), listaClientes[i].getSaldo());
                }
                System.out.printf("Digite o id do cliente para realizar o saque: ");
                id_cliente = ler.nextInt();
                System.out.printf("Digite o valor do saque: ");
                Valor = ler.nextDouble();
                listaClientes[id_cliente].sacar(Valor);

            } else if (opcao == 4) {
                for (int i = 0; i < id; i++){
                    System.out.printf("Id: %d | Agencia: %s | Conta: %s | Nome: %s | Saldo: %.2f\n", i, listaClientes[i].getAgencia(), listaClientes[i].getConta(), listaClientes[i].getNome(), listaClientes[i].getSaldo());
                }
                System.out.printf("Digite o id do cliente remetente: ");
                id_cliente = ler.nextInt();
                System.out.printf("Digite o id do cliente destinatário: ");
                id_cliente_dest = ler.nextInt();
                System.out.printf("Digite o valor da transferência: ");
                Valor = ler.nextDouble();
                listaClientes[id_cliente].transferir(Valor, listaClientes[id_cliente_dest]);

            } else if (opcao == 5) {
                for (int i = 0; i < id; i++){
                    System.out.printf("Id: %d | Agencia: %s | Conta: %s | Nome: %s | Saldo: %.2f\n", i, listaClientes[i].getAgencia(), listaClientes[i].getConta(), listaClientes[i].getNome(), listaClientes[i].getSaldo());
                }
                System.out.printf("Digite o id do cliente para emitir o saldo: ");
                id_cliente = ler.nextInt();
                System.out.printf("Saldo de %s: R$ %.2f\n", listaClientes[id_cliente].getNome(), listaClientes[id_cliente].emitirSaldo());
            } else if (opcao == 6) {
                for (int i = 0; i < id; i++){
                    System.out.printf("Id: %d | Agencia: %s | Conta: %s | Nome: %s | Saldo: %.2f\n", i, listaClientes[i].getAgencia(), listaClientes[i].getConta(), listaClientes[i].getNome(), listaClientes[i].getSaldo());
                }
                System.out.printf("Digite o id do cliente para emitir o histórico: ");
                id_cliente = ler.nextInt();
                System.out.println("Histórico de transações de " + listaClientes[id_cliente].getNome() + ":");
                System.out.println(listaClientes[id_cliente].getHistorico());

            } else{
                break;
            }
        }

        ler.close();
    }
}
