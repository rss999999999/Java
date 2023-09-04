package _05EstruturaCondicional;
import java.util.Locale;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ExerciciosPropostos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*
        int x;

        System.out.println("Digite um número inteiro:");
        x = sc.nextInt();

        if (x <= 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }

        sc.close();

        */ //Ex1
/*

        int y;
        System.out.println("Digite outro número inteiro:");
        y = sc.nextInt();

        if (y % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }

        sc.close();
        */ //Ex2
/*

        int a, b;
        System.out.println("Digite dois números inteiros:");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

        sc.close();
        */ //Ex3
/*

//        Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
        int HoraInicial;
        int HoraFinal;
        int Duracao;

        System.out.println("Digite a hora inicial");
        HoraInicial = sc.nextInt();
        System.out.println("Digite a hora final");
        HoraFinal = sc.nextInt();


        if (HoraInicial < HoraFinal) {
            Duracao = HoraFinal - HoraInicial;
        } else {
            Duracao = 24 - HoraInicial + HoraFinal;
        }

        System.out.println("O jogo durou " + Duracao + " hora(s)");

        sc.close();
        */ //Ex4
/*

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
        */ //Ex5
/*

//        Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//        seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//        nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”
//        double numero;
        System.out.println("Digite um número:");
        numero = sc.nextDouble();
        if (numero >= 0 && numero <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (numero > 25 && numero <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (numero > 50 && numero <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (numero > 75 && numero <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
        sc.close();
        */ //Ex6
/*


//        Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano.
//        A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na
//        origem (x = y = 0).
//        Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
        sc.useLocale(Locale.US); // Set the locale to use dot as the decimal separator
        double x, y;
        try {
            System.out.println("Digite o valor de x:");
            x = sc.nextDouble();
            System.out.println("Digite o valor de y:");
            y = sc.nextDouble();
            if (x == 0 && y == 0) {
                System.out.println("Origem");
            } else if (x == 0) {
                System.out.println("Eixo Y");
            } else if (y == 0) {
                System.out.println("Eixo X");
            } else if (x > 0 && y > 0) {
                System.out.println("Q1");
            } else if (x < 0 && y > 0) {
                System.out.println("Q2");
            } else if (x < 0 && y < 0) {
                System.out.println("Q3");
            } else {
                System.out.println("Q4");
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de fornecer valores numéricos corretos.");
        } finally {
            sc.close();
        }
            */ //Ex7
/*


//        Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
//        que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
//        qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
//        Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
//        mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
//        Renda: Imposto de Renda
//        de 0.00 a R$ 2000.00: Isento
//        de R$ 2000.01 até R$ 3000.00: 8%
//        de R$ 3000.01 até R$ 4500.00: 18%
//        acima de R$ 4500.00: 28%
//        Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
//        salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa
//        é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
//        duas casas decimais.
        sc.useLocale(Locale.US); // Set the locale to use dot as the decimal separator
        double renda, imposto;
        System.out.println("Digite o valor da renda:");
        renda = sc.nextDouble();
        if (renda <= 2000.00) {
            System.out.println("Isento");
        } else if (renda <= 3000.00) {
            imposto = (renda - 2000.00) * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        } else if (renda <= 4500.00) {
            imposto = (renda - 3000.00) * 0.18 + 1000.00 * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        } else {
            imposto = (renda - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
*/ //Ex8


    }
}