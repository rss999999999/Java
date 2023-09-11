package _06EstruturasRepetitivas;

import java.util.Scanner;

public class EPTresOutraFormaWhileIfSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = "Digite o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim):";

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int tipoCombustivel;

        while (true) {
            System.out.println(message);
            tipoCombustivel = sc.nextInt();

            if (tipoCombustivel == 4) {
                break;
            }

            switch (tipoCombustivel) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                default:
                    System.out.println("Código inválido. Tente novamente.");
                    continue;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}