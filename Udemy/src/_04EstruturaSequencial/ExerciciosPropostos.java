package _04EstruturaSequencial;
import java.util.Locale;


import java.util.Scanner;

public class ExerciciosPropostos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

//        double x = 3.0;
//        double y = 4.0;
//        double z = -5.0;
//        double A, B, C;
//        A = Math.sqrt(x);
//        B = Math.sqrt(y);
//        C = Math.sqrt(25.0);
//        System.out.println("Raiz quadrada de " + x + " = " + A);
//        System.out.println("Raiz quadrada de " + y + " = " + B);
//        System.out.println("Raiz quadrada de 25 = " + C);
//        A = Math.pow(x, y);
//        B = Math.pow(x, 2.0);
//        C = Math.pow(5.0, 2.0);
//        System.out.println(x + " elevado a " + y + " = " + A);
//        System.out.println(x + " elevado ao quadrado = " + B);
//        System.out.println("5 elevado ao quadrado = " + C);
//        A = Math.abs(y);
//        B = Math.abs(z);
//        System.out.println("Valor absoluto de " + y + " = " + A);
//        System.out.println("Valor absoluto de " + z + " = " + B);
//
//        // Exercício 1
//        Scanner sc = new Scanner(System.in);
//        String s1, s2;
//        s1 = sc.nextLine();
//        s2 = sc.nextLine();
//
//        System.out.println("A soma dos números digitados é:");
//        System.out.println(s1+s2);
//
//        sc.close();

// Exercício 2 (calculando a área de um círculo)

//        double raio, area;
//        Scanner sc2 = new Scanner(System.in);
//
//        System.out.println("Digite o valor do raio:");
//        raio = sc2.nextDouble();
//        System.out.println("O valor do raio é: " + 3.14159 * Math.pow(raio, 2));

// Exercício 3 (Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).)

//        int a, b, c, d, diferenca;
//        Scanner sc3 = new Scanner(System.in);
//        System.out.println("Digite o valor de A:");
//        a = sc3.nextInt();
//        System.out.println("Digite o valor de B:");
//        b = sc3.nextInt();
//        System.out.println("Digite o valor de C:");
//        c = sc3.nextInt();
//        System.out.println("Digite o valor de D:");
//        d = sc3.nextInt();
//        diferenca = (a * b - c * d);
//        System.out.println("A diferença do produto de A e B pelo produto de C e D é: " + diferenca);

//Exercício 4 (Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.)

//        Scanner sc = new Scanner(System.in);
//        int numeroFuncionario, horasTrabalhadas;
//        double valorHora, salario;
//        System.out.println("Digite o número do funcionário:");
//        numeroFuncionario = sc.nextInt();
//        System.out.println("Digite o número de horas trabalhadas:");
//        horasTrabalhadas = sc.nextInt();
//        System.out.println("Digite o valor da hora trabalhada:");
//        valorHora = sc.nextDouble();
//        salario = horasTrabalhadas * valorHora;
//        System.out.println("O número do funcionário é: " + numeroFuncionario);
//        System.out.printf("O salário do funcionário é: %.2f%n", salario);
//        sc.close();

//Exercício 5 (Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.)

//        Scanner sc = new Scanner(System.in);
//        int codigoPeca1, numeroPecas1, codigoPeca2, numeroPecas2;
//        double valorUnitarioPeca1, valorUnitarioPeca2, valorTotal;
//
//        System.out.println("Digite o código da peça 1:");
//        codigoPeca1 = sc.nextInt();
//        System.out.println("Digite o número de peças 1:");
//        numeroPecas1 = sc.nextInt();
//        System.out.println("Digite o valor unitário da peça 1:");
//        valorUnitarioPeca1 = sc.nextDouble();
//        System.out.println("Digite o código da peça 2:");
//        codigoPeca2 = sc.nextInt();
//        System.out.println("Digite o número de peças 2:");
//        numeroPecas2 = sc.nextInt();
//        System.out.println("Digite o valor unitário da peça 2:");
//        valorUnitarioPeca2 = sc.nextDouble();
//        valorTotal = numeroPecas1 * valorUnitarioPeca1 + numeroPecas2 * valorUnitarioPeca2;
//        System.out.printf("O valor total a ser pago é: %.2f%n", valorTotal);
//        sc.close();

//Exercício 6 (Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.)

//        Scanner sc = new Scanner(System.in);
//        double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
//        System.out.println("Digite o valor de A:");
//        a = sc.nextDouble();
//        System.out.println("Digite o valor de B:");
//        b = sc.nextDouble();
//        System.out.println("Digite o valor de C:");
//        c = sc.nextDouble();
//        areaTriangulo = a * c / 2;
//        areaCirculo = 3.14159 * Math.pow(c, 2);
//        areaTrapezio = (a + b) / 2 * c;
//        areaQuadrado = Math.pow(b, 2);
//        areaRetangulo = a * b;
//        System.out.printf("A área do triângulo retângulo que tem A por base e C por altura é: %.3f%n", areaTriangulo);
//        System.out.printf("A área do círculo de raio C é: %.3f%n", areaCirculo);
//        System.out.printf("A área do trapézio que tem A e B por bases e C por altura é: %.3f%n", areaTrapezio);
//        System.out.printf("A área do quadrado que tem lado B é: %.3f%n", areaQuadrado);
//        System.out.printf("A área do retângulo que tem lados A e B é: %.3f%n", areaRetangulo);
//        sc.close();



    }
}