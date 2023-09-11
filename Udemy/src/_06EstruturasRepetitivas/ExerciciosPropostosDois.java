/*
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma)
*/

package _06EstruturasRepetitivas;

import java.util.Scanner;

public class ExerciciosPropostosDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        do {
            //O readInput() é uma função que recebe uma mensagem e retorna um inteiro
            x = readInput(sc, "Digite o valor de X:");
            y = readInput(sc, "Digite o valor de Y:");

            if (x > 0 && y > 0) {
                System.out.println("Primeiro Quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo Quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro Quadrante");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto Quadrante");
            }
        } while (x != 0 && y != 0);

        sc.close();
    }

    //O private static int readInput() é uma função que recebe uma mensagem e retorna um inteiro
    //O @org.jetbrains.annotations é uma anotação que o IntelliJ IDEA coloca automaticamente quando você cria uma função que retorna um valor e não tem um return no final da função.
    //Ela é usada para indicar que a função retorna um valor. Ela não é necessária, mas é uma boa prática.
    //O private não permite que a função seja acessada de fora da classe (ExercicioPropostoDois). O static permite que a função seja acessada sem precisar instanciar um objeto da classe.
    // O int indica que a função retorna um inteiro. O readInput é o nome da função. O Scanner sc é o parâmetro da função. O String message é o parâmetro da função.
    private static int readInput(@org.jetbrains.annotations.NotNull Scanner sc, String message) {
        System.out.println(message);  //message é a mensagem que a função recebe como parâmetro
        return sc.nextInt();
    }
}


//        System.out.println("Digite o valor de X:");
//                int x = sc.nextInt();
//                System.out.println("Digite o valor de Y:");
//                int y = sc.nextInt();
//
//                while (x != 0 && y != 0) {
//                if (x > 0 && y > 0) {
//                System.out.println("Primeiro Quadrante");
//                } else if (x < 0 && y > 0) {
//        System.out.println("Segundo Quadrante");
//        } else if (x < 0 && y < 0) {
//        System.out.println("Terceiro Quadrante");
//        } else {
//        System.out.println("Quarto Quadrante");
//        }
//        System.out.println("Digite o valor de X:");
//        x = sc.nextInt();
//        System.out.println("Digite o valor de Y:");
//        y = sc.nextInt();
//        }