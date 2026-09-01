package Ex43;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<Conta> contas = new ArrayList<>();

        int opcao;
        int selecionado;
        int contaPoupanca = 0;
        int contaCorrente = 0;

        while(true){
            System.out.printf("===> Sistemas de operações <===\n\n");
            System.out.printf("Escolha uma opção:\n");
            System.out.printf("1 - Criar conta corrente \n" +
                    "2 - Criar conta poupança \n" +
                    "3 - Depositar \n" +
                    "4 - Sacar \n" +
                    "5 - Sair\n\n");


            System.out.printf("Digite a opção desejada: ");
            opcao = ler.nextInt();

            if(opcao == 1){
                ContaCorrente contaC = new ContaCorrente();
                contaC.setId(contaCorrente++);
                System.out.printf("Digite o nome do titular da conta: ");
                contaC.setTitular(ler.next());
                System.out.printf("Digite o número da conta: ");
                contaC.setConta(ler.next());
                System.out.printf("Digite o número da agência: ");
                contaC.setAgencia(ler.next());

                contas.add(contaC);
            }
            else if(opcao == 2){
                ContaPoupanca contaP = new ContaPoupanca();
                contaP.setId(contaPoupanca++);
                System.out.printf("Digite o nome do titular da conta: ");
                contaP.setTitular(ler.next());
                System.out.printf("Digite o número da conta: ");
                contaP.setConta(ler.next());
                System.out.printf("Digite o número da agência: ");
                contaP.setAgencia(ler.next());

                contas.add(contaP);
            }
            else if(opcao == 3){
                for(int i = 0; i < contas.size(); i++){
                    System.out.printf("ID: %d | Titular: %s | Tipo: %s\n", contas.get(i).getId(), contas.get(i).getTitular(), contas.get(i) instanceof ContaCorrente ? "Conta Corrente" : "Conta Poupança");
                }
                System.out.printf("Digite o ID da conta para depositar: ");
                selecionado = ler.nextInt();
                System.out.printf("Digite o valor para depositar: ");
                double valor = ler.nextDouble();
                contas.get(selecionado).deposito(valor);

            }
        }
    }
}
