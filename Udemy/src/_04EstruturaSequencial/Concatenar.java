package _04EstruturaSequencial;

/**
 * Estrutura Sequencial.
 *
 * Autor: Rodrigo Soares Sampaio
 * Data: 01/09/2023
 * Versão: 0.1
 *
 * "%s": Especificador para substituir por uma string. É usado quando você deseja inserir um valor de tipo String na string formatada.
 * "%d": Especificador para substituir por um número inteiro (tipo int). É usado quando você deseja inserir um valor inteiro na string formatada.
 * "%f": Especificador para substituir por um número de ponto flutuante (tipo float ou double). É usado quando você deseja inserir um valor de ponto flutuante na string formatada.
 *
 *
 */
import java.util.Locale;

public class Concatenar {
    public static void main(String[] args) {
        // Definindo o Locale padrão como US para formatação de números
        Locale.setDefault(Locale.US);

        // Declarando e inicializando variáveis
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        // Imprimindo a frase formatada com os valores das variáveis
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

        //A autoendentação no intellij é: ctrl+alt+L
        //sout para o sysout (vscode)

        float b, B, h, area;
        b = 6f;
        B = 8f;
        h = 5f;
        area = (b + B) / 2f * h;
        System.out.println(area);


    }
}

