import java.util.Scanner;

public class aula05 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double temp, f;

        System.out.printf("Digite uma temperatura em graus celcius:");
        temp = sc.nextInt();

        f = (temp * 1.8) + 32;

        System.out.printf("A sua temperatura de %.1f °C equivale a %.1f°F", temp, f);

        sc.close();

    }
}
