package teste7;

import java.util.Scanner;

public class Programa {
    static void main() {
        Scanner sc = new Scanner(System.in);

        Pessoa[] listaPessoas = new Pessoa[3];
        int id;
        String nome;
        char possuiDependente;
        int idadeDep;
        String nomeDep;

        for (int i = 0; i <= 2; i++) {
            Pessoa p;
            System.out.printf("Digite o id da pessoa %d: ", i + 1);
            id = sc.nextInt();

            System.out.printf("Digite o nome da pessoa %d: ", i + 1);
            nome = sc.next();

            System.out.printf("A pessoa %d possui dependente? (S/N): ", i + 1);
            possuiDependente = sc.next().charAt(0);

            if (possuiDependente == 'S') {
                System.out.printf("Digite o nome do dependente da pessoa %d: ", i + 1);
                nomeDep = sc.next();

                System.out.printf("Digite a idade do dependente da pessoa %d: ", i + 1);
                idadeDep = sc.nextInt();

                dependente d = new dependente(nomeDep, idadeDep);

                p = new Pessoa(nome, d, id);
            } else {
                p = new Pessoa(nome, null, id);
            }

            listaPessoas[i] = p;
        }

        for (int i = 0; i <= 2; i++) {
            System.out.printf("\nPessoa %d criada com sucesso (%s)!", listaPessoas[i].id, listaPessoas[i].nome);

            if (listaPessoas[i].dependente != null) {
                System.out.printf("\n Dependente: %s", listaPessoas[i].exibirDependente());
            }
        }
        sc.close();
    }
}
