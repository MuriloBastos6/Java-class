package Ex50;

import java.util.HashMap;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        HashMap<Integer, Cliente> map = new HashMap<Integer, Cliente>();
        Scanner leitor = new Scanner(System.in);

        int id = 0;
        String continuar;

        System.out.println("-----------Bem vindo ao Cadastro de Clientes!---------");
        while (true) {
            Cliente c = new Cliente();

            id++;
            c.setId(id);

            System.out.println("Primeiro digite o nome do seu cliente:");
            c.setNome(leitor.next());
            System.out.println("Segundamente  digite a idade do seu cliente:");
            c.setIdade(leitor.nextInt());
            System.out.println("Por fim digite o email do seu cliente:");
            c.setEmail(leitor.next());

            map.put(id, c);

            System.out.println("Deseja continuar cadastrando clientes? (S/N)");
            continuar = leitor.next().toUpperCase();

            if(continuar.equals("N")){
                break;
            }
        }
            map.forEach((chave, valor) ->{
                System.out.print("Cliente " + chave + "\nNome: " + valor.getNome() + "\nIdade: " + valor.getIdade() + "\nE-mail: " + valor.getEmail() + "\n" + "\n");
            });

    }
}
