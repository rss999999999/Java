package _06EstruturasRepetitivas;

import java.util.Scanner;

/*

Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X,
um valor por linha, inclusive o X, se for o caso.

*/

public class EPFor1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro entre 1 e 1000:");
        int x = sc.nextInt();


        for (int i = 0; i < x; i++) {
            if ((i + 1) % 2 == 0) {
                System.out.println(i + " ");
            }
        }

    }
}

