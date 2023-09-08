
package _07OutrosTopcs;

import java.util.Locale;
import java.util.Scanner;

public class EqSegundoGrau {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta;
        System.out.println("Digite os valores dos coeficientes:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        delta = b * b - 4 * a * c; // cálculo do valor de delta
        System.out.printf("Delta = %.4f%n", delta);

    }
}