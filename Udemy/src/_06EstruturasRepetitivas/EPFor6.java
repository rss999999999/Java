/*

Ler um número inteiro N e calcular todos os seus divisores.

*/
package _06EstruturasRepetitivas;

import java.util.Scanner;
import java.util.Locale;

public class EPFor6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para calcular seus divisores:");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.println("O número " + i + " é divisor de " + x + ".");
            }

        }
    }
}