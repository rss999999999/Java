package _06EstruturasRepetitivas;

import java.util.Scanner;

/*

Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

*/

public class EPFor2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas valores inteiros serão lidos?");
        int x = sc.nextInt();

        int out = 0;
        int in = 0;

        for (int i = 0; i < x; i++) {
            System.out.println("Digite um número inteiro:");
            int y  = sc.nextInt();

                if (y>=10 & y<=20) {
                    in++;
                }
                else {
                    out++;
                }
            }

        System.out.println("in: " +  in);
        System.out.println("out: " + out);
        sc.close();

        }
    }


