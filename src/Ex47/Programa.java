package Ex47;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        try {
            System.out.println("Digite o primeiro valor: ");
            int val1 = leitor.nextInt();
            System.out.println("Digite o segundo valor: ");
            int val2 = leitor.nextInt();
            int resultado = val1 / val2;
            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Todos o valores devem ser numericos sem letras: ");

        } catch (ArithmeticException e) {
            System.out.println("Um dos valores é inválido para a operação de divisão: ");

        }finally {
            leitor.close();
            System.out.println("Programa finalizado!");
        }
        System.out.println("O programa continua rodando normalmente sem quebrar!");
    }
}
