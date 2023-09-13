package _06EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class EPFor3 {
    public static void main(String[] args) {
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);

                System.out.println("Quantas vezes você quer que o programa repita?");
                int x = sc.nextInt();

                    for ( int j = 0; j < x; j++) {
                        System.out.println("Digite os 3 (double) da " + (j+1) +"º sequência de números (com casa decimal):");
                        double a = sc.nextDouble();
                        double b = sc.nextDouble();
                        double c = sc.nextDouble();

                        double mediaPonderada = (2*a + 3*b + 5*c) / 10.0;
                        System.out.printf("Média ponderada: %.1f%n", mediaPonderada);
            }
        sc.close();
    }

}
