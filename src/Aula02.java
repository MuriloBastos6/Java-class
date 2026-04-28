import java.util.Scanner;

public class Aula02 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int l, a;

        System.out.printf("Digite o valor do lado de um quadrado?");
       l = sc.nextInt();

       a = l * l;

        System.out.printf("O valor da area do quadrado e: %d, Que seria a %d muplicado por %d", a , l, l );
        sc.close();

    }
}
