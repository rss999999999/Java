package _05EstruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

//Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
//dá direito a 100 minutos de telefone. Cada minuto que exceder a
//franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
//quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
//a ser pago.

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double minutos;
        double valor;

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