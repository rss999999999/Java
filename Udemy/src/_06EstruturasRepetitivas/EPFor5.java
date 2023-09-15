package _06EstruturasRepetitivas;

import java.util.Scanner;
import java.util.Locale;

public class EPFor5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int fatorial = 1;

        System.out.println("Digite um número maior que 0 para calcular o fatorial:");
        int x = sc.nextInt();

        if (x == 1) {
            System.out.println("O resultado é: 1");
        } else if (x == 0) {
            System.out.println("O resultado é: 0");
        } else if (x <= -1) {
            System.out.println("Voce digitou um número negativo. Tente novamente.");
        } else {
            for (int j = 1; j <= x; j++) {
                fatorial *= j;
            }
            System.out.println("O resultado é: " + fatorial);
            sc.close();
        }
    }
}