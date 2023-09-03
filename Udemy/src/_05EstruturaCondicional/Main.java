package _05EstruturaCondicional;
import java.util.Locale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double minutos;
        double valor = 0;

        System.out.print("Digite a quantidade de minutos: ");
        minutos = sc.nextDouble();

        if (minutos > 100.0) {
            valor = (minutos - 100.0) * 2.0 + 50.0;
        } else {
            valor = 50.0;
        }
        System.out.printf("Valor a pagar: R$ %.2f ", valor);
        sc.close();
    }
}