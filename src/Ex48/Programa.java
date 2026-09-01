package Ex48;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
    private static boolean[] assentos = new boolean[11];

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        assentos[3] = true;
        assentos[5] = true;

        System.out.println("===================================Sistema de escolha de assentos de avião===============================");
        System.out.println("Escolha um assento de (1 a 10)");
        System.out.println("Nota: Os assentos 3 e 5 já estão ocupados");

        boolean reservaConcluida = false;

        while (!reservaConcluida) {
            try {
                System.out.println("Digite o número do assento (1 a 10): ");
                int numeroAssento = leitor.nextInt();

                reserversarAssento(numeroAssento);
                reservaConcluida = true;
                System.out.printf("Assento %d reservado com sucesso! %n", numeroAssento );
            } catch (AssentoInvalidoException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Tente novamente.");
            } catch (AssentoOcupadoException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Tente novamente.");
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
                leitor.next(); // Limpa o buffer do scanner
            }
        }
        leitor.close();
        System.out.println("Obrigado por utilizar o sistema de reservas de assentos!");
    }

    public static void reserversarAssento(int numero) throws AssentoInvalidoException, AssentoOcupadoException {
        if (numero < 1 || numero > 10) {
            throw new AssentoInvalidoException("Assento inválido! Escolha um número entre 1 e 10.");
        }
        if (assentos[numero]) {
            throw new AssentoOcupadoException("Assento ocupado! Escolha outro assento.");
        }
        assentos[numero] = true;
    }
}

