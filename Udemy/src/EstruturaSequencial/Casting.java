/**
 * Casting
 *
 * Autor: Rodrigo Soares Sampaio
 * Data: 02/09/2023
 * Versão: 0.1
 *
 *
 */
package EstruturaSequencial;
import java.util.Locale;
public class Casting {
    public static void main(String[] args) {
        // Definindo o Locale padrão como US para formatação de números
        Locale.setDefault(Locale.US);


        float b, B, h, area;
        b = 6f;
        B = 8f;
        h = 5f;
        area = (b + B) / 2f * h;
        System.out.println(area);

        int x, y;
        double resultado;
        x = 5;
        y = 2;
        resultado = (double) x / y;  //casting
        System.out.println(resultado);


    }
}

