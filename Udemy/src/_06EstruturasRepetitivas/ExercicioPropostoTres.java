package _06EstruturasRepetitivas;
import java.util.Scanner;

/*

Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível.

*/

public class ExercicioPropostoTres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String message = "Digite o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim):";

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int tipoCombustivel = 0;

        do {
            System.out.println(message);
            tipoCombustivel = sc.nextInt();
            if (tipoCombustivel == 1) {
                alcool++;
            } else if (tipoCombustivel == 2) {
                gasolina++;
            } else if (tipoCombustivel == 3) {
                diesel++;
            }
        } while (tipoCombustivel != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();


    }

}


/*
    O código fornecido parece estar funcionando corretamente para o propósito descrito no enunciado do exercício. No entanto, aqui estão algumas melhorias que você pode considerar:

        1- Use constantes para representar os códigos dos tipos de combustível em vez de números literais. Isso torna o código mais legível e facilita a manutenção no futuro.
        2- Adicione validação para garantir que o usuário insira apenas códigos válidos. Você pode usar um loop while para solicitar um novo código até que seja válido.
        3- Use uma estrutura de switch-case em vez de vários if-else if para melhorar a legibilidade do código.

        Código reformulado em _06EstruturasRepetitivas\EPTresOutraFormaWhileIfSwitch

*/
