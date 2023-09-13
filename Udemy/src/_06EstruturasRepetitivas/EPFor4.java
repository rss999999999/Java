package _06EstruturasRepetitivas;

import java.util.Scanner;
import java.util.Locale;
public class EPFor4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas vezes você quer que o programa repita?");
        int x = sc.nextInt();

        for ( int j = 0; j < x; j++) {
            System.out.println("Digite o numerador:");
            double a = sc.nextDouble();
            System.out.println("Digite o denominador:");
            double b = sc.nextDouble();

                if (b == 0) {
                    System.out.println("Divisão impossível");
                }
                else {
                    double divisao = a / b;
                    System.out.printf("Divisão: %.1f%n", divisao);
                }
        }
        sc.close();
    }
}
