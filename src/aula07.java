import java.util.Scanner;

public class aula07 {
    static void main() {
        Scanner  sc = new Scanner(System.in);

        double a, b, c, d, e, valor, troco, soma;

        System.out.println("Diigite o valor do produto:");
        a = sc.nextDouble();

        System.out.println("Diigite o valor do produto:");
        b = sc.nextDouble();

        System.out.println("Diigite o valor do produto:");
        c = sc.nextDouble();

        System.out.println("Diigite o valor do produto:");
        d = sc.nextDouble();

        System.out.println("Diigite o valor do produto:");
        e = sc.nextDouble();

        System.out.println("Diigite o valor do seu pagamento:");
        valor = sc.nextDouble();


        soma = a + b + c + d + e;

        troco = valor - soma;

        System.out.printf("O seu troco e:%.2f pois seu produtos deram R$%.2f", troco, soma);

        sc.close();
    }
}
