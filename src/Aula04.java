import java.util.Scanner;

public class Aula04 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int  a, b, c, d, media;

        System.out.print("Digite um numero?");
        a = sc.nextInt();
        System.out.print("Digite um numero?");
        b= sc.nextInt();
        System.out.print("Digite um numero?");
        c = sc.nextInt();
        System.out.print("Digite um numero?");
        d = sc.nextInt();

        media = (a + b + c + d) / 4;

        System.out.printf("A media dos numero é: %d", media);



        sc.close();
    }
}
