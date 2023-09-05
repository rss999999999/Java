package _06EstruturasRepetitivas;
import java.util.Scanner;

//Fazer um programa que lê um valor
//inteiro N e depois N números inteiros.
//Ao final, mostra a soma dos N números
//lidos.

public class SomaIntUsandoFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos números inteiros você quer somar: ");
        int n = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            int x = sc.nextInt();
            soma += x;
        }
        System.out.println("Soma = " + soma);
        sc.close();
    }
}

