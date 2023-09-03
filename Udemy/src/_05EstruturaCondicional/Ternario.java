

package _05EstruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

//Esse código calcula o desconto de um produto conforme o seu preço usando o operador ternário.

public class Ternario {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double preco;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do preço:");
        preco = sc.nextDouble();

        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println("Desconto:" + desconto);
        System.out.println("Valor a pagar:" + (preco - desconto)    );
        sc.close();
    }
}
