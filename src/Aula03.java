import java.util.Scanner;

public class Aula03 {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int b, a, area;

        System.out.printf("Digite o valor da base do triangulo?");
        b = sc.nextInt();

        System.out.printf("Digite o valor da altura do triangulo?");
        a = sc.nextInt();

        area = (b * a) /2;

        System.out.printf("A area do seu triangulo e: %d pois %d multiplicado por %d divido por 2 da esse resultado", area,b,a);

        sc.close();
    }
}
