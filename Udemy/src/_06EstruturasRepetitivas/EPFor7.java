/*

Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor.

*/

package _06EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class EPFor7 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para calcular a sequencia de quadrados e cubos:");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            System.out.println(
                    "Na " + i + "º o valor de i é: " + i +
                            " e o quadrado de x é: " + (i * i) +
                            " e o cubo de x é: " + (i * i * i) + "."
            );
        }

    }
}
