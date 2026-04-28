import java.util.Scanner;

public class aula06 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double cotacao, valor, real;

        System.out.printf("Digite a cotacao do dolar hoje:");
        cotacao = sc.nextDouble();

        System.out.printf("Digite sua quantia em dolares:");
        valor = sc.nextDouble();

        real = cotacao * valor;

        System.out.printf("O seu valor em R$%.2f", real);

        sc.close();
    }
}
