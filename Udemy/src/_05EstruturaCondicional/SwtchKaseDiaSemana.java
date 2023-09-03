package _05EstruturaCondicional;
import java.util.Locale;
import java.util.Scanner;



public class SwtchKaseDiaSemana {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int x;

        System.out.println("Digite um número de 1 a 7:");
        switch (x = sc.nextInt()) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-feira");
            case 3 -> System.out.println("Terça-feira");
            case 4 -> System.out.println("Quarta-feira");
            case 5 -> System.out.println("Quinta-feira");
            case 6 -> System.out.println("Sexta-feira");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Valor inválido");
        }

        System.out.printf("Temos que o dia da semana é: %d\n", x);
        sc.close();
    }
}
