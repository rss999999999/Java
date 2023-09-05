
package _06EstruturasRepetitivas;
import java.util.Locale;
import java.util.Scanner;

public class AteZero {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


/////
//        Fazer um programa que lê números
//        inteiros até que um zero seja lido. Ao
//        final mostra a soma dos números lidos
//        (não incluindo o zero).
/////

        int x = sc.nextInt();  //aqui ele já lê o primeiro número
        int soma = 0;          //aqui ele já inicia a soma com zero
        while (x != 0) {      //enquanto x for diferente de zero
            soma += x;          //soma recebe soma + x
            x = sc.nextInt();       //x recebe o próximo número
        }
        System.out.println("Soma = " + soma);   //imprime a soma



        sc.close();




    }
}


