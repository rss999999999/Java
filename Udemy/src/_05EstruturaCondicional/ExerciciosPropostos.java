package _05EstruturaCondicional;
import java.util.Scanner;


public class ExerciciosPropostos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Exercício 1

//        int x;
//
//        System.out.println("Digite um número inteiro:");
//        x = sc.nextInt();
//
//        if (x <= 0) {
//            System.out.println("NEGATIVO");
//        } else {
//            System.out.println("NÃO NEGATIVO");
//        }
//
//        sc.close();


        // Exercício 2
//
//        int y;
//        System.out.println("Digite outro número inteiro:");
//        y = sc.nextInt();
//
//        if (y % 2 == 0) {
//            System.out.println("PAR");
//        } else {
//            System.out.println("ÍMPAR");
//        }
//
//        sc.close();

        //Exercício 3

//        int a, b;
//        System.out.println("Digite dois números inteiros:");
//        a = sc.nextInt();
//        b = sc.nextInt();
//
//        if (a % b == 0 || b % a == 0) {
//            System.out.println("São múltiplos");
//        } else {
//            System.out.println("Não são múltiplos");
//        }
//
//        sc.close();


//        Exercício 4
//        Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

//        int HoraInicial;
//        int HoraFinal;
//        int Duracao;
//
//        System.out.println("Digite a hora inicial");
//        HoraInicial = sc.nextInt();
//        System.out.println("Digite a hora final");
//        HoraFinal = sc.nextInt();
//
//
//        if (HoraInicial < HoraFinal) {
//            Duracao = HoraFinal - HoraInicial;
//        } else {
//            Duracao = 24 - HoraInicial + HoraFinal;
//        }
//
//        System.out.println("O jogo durou " + Duracao + " hora(s)");
//
//        sc.close();

        // Exercício 5

        int codigo;
        int quantidade;
        double total;
        double preco;

        System.out.println("Digite o código do produto:");
        codigo = sc.nextInt();
        System.out.println("Digite a quantidade do produto:");
        quantidade = sc.nextInt();

        switch (codigo) {
            case 1 -> {
                preco = 4.00;
                total = quantidade * preco;
                System.out.printf("Total: R$ %.2f%n", total);
            }
            case 2 -> {
                preco = 4.50;
                total = quantidade * preco;
                System.out.printf("Total: R$ %.2f%n", total);
            }
            case 3 -> {
                preco = 5.00;
                total = quantidade * preco;
                System.out.printf("Total: R$ %.2f%n", total);
            }
            case 4 -> {
                preco = 2.00;
                total = quantidade * preco;
                System.out.printf("Total: R$ %.2f%n", total);
            }
            case 5 -> {
                preco = 1.50;
                total = quantidade * preco;
                System.out.printf("Total: R$ %.2f%n", total);
            }
            default -> System.out.println("Código inválido");
        }

        sc.close();

    }
}

