package _06EstruturasRepetitivas;

import java.util.Scanner;

/*

Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

*/

public class EPFor2IA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas valores inteiros serão lidos?");
        int quantidadeValores = sc.nextInt();

        System.out.println("Informe o valor mínimo do intervalo ([):");
        int valorMinimo = sc.nextInt();

        System.out.println("Informe o valor máximo do intervalo (]):");
        int valorMaximo = sc.nextInt();

        int dentroIntervalo = 0;
        int foraIntervalo = 0;

        for (int i = 0; i < quantidadeValores; i++) {
            System.out.println("Informe o " + (i + 1) + "º número inteiro:");
            int valor = sc.nextInt();

            if (valor >= valorMinimo && valor <= valorMaximo) {
                dentroIntervalo++;
            } else {
                foraIntervalo++;
            }
        }

        System.out.println("Valores dentro do intervalo: " + dentroIntervalo);
        System.out.println("Valores fora do intervalo: " + foraIntervalo);

        sc.close();
    }
}