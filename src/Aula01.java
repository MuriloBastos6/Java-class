import java.util.Scanner;

public class Aula01 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int b, a, area;

        System.out.printf("Digite a base de retangulo?");
        b = sc.nextInt();

        System.out.printf("Digite a altura do retangulo?");
        a = sc.nextInt();

        area = a * b;

        System.out.printf("Sua area e: " + area);
        sc.close();

    }
}
