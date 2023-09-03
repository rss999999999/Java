//    (DEMO)
//    Problema exemplo não declara variável discount antes do if:
//
//    double price = sc.nextDouble();
//    if (price > 100.0) {
//      double discount = price * 0.1;
//    }
//    System.out.println(discount);


package _05EstruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class VariavelNaoIniciada {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double price = sc.nextDouble();
        double discount = 0.0;

        if (price > 100.0) {
            discount = price * 0.1;
        }

        System.out.println(discount);
        sc.close();
    }
}

