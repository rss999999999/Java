package _04EstruturaSequencial;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); //Para considerar o separador de decimais como ponto
        int x = 10;

        System.out.print("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println(x);
        System.out.printf("%.2f%n", (double) x); // Corrected format specifier and argument
        System.out.printf("%.4f%n", (double) x); // Corrected format specifier and argument
        System.out.println("Resultado = " + x + " metros"); //concatenar elementos
        System.out.printf("Resultado %.2f metros%n", (double) x); //concatenar elementos, casting. n=quebbrarLinha; f=ponto;




    }
}