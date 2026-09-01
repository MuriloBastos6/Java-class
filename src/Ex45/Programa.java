package Ex45;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();

        String baseDados = "CJose dos Santos,42,Sao Paulo;CSandra Silva,36,Sao Jose do Rio Preto;CAugusto Soares,22,Sao Paulo;CVanderlei Azevedo,45,Santos;CVanessa Ferreira,27,Sao Paulo;PMouse,1,9.90;PTeclado,3,19.90;PMonitor,2,349.90;PHD SSD,2,199.90;PProcessador,1,350.00";
        String[] registros = baseDados.split(";");

        for (String registro : registros) {
            String[] infoRegistros = registro.split(",");
            if (infoRegistros[0].substring(0, 1).equals("C")) {
                Cliente c = new Cliente();

                c.setNome(infoRegistros[0].substring(1));
                c.setIdade(Integer.parseInt(infoRegistros[1]));
                c.setCidade(infoRegistros[2]);

                clientes.add(c);
            } else if (infoRegistros[0].substring(0, 1).equals("P")) {
                Produto p = new Produto();

                p.setNome(infoRegistros[0].substring(1));
                p.setQtde(Integer.parseInt(infoRegistros[1]));
                p.setPreco(Double.parseDouble(infoRegistros[2]));

                produtos.add(p);
            }
        }
        System.out.println("Lista de Clientes:");
        for (Cliente c : clientes){
            System.out.println("Nome: " + c.getNome());
            System.out.println("Idade: " + c.getIdade());
            System.out.println("Cidade: " + c.getCidade() + "\n");
        }


        System.out.println("\n\n");


        System.out.println("Lista de Produtos:");
        for (Produto p: produtos){
            System.out.println("Nome: " + p.getNome());
            System.out.println("Quantidade: " + p.getQtde());
            System.out.println("Preço: " + p.getPreco() + "\n");
        }

    }
}
