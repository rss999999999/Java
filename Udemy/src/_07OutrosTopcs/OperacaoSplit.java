package _07OutrosTopcs;

public class OperacaoSplit {
    public static void main(String[] args) {
        String s = "potato apple lemon";

        //String[] usa vetor para armazenar os elementos da string, separados por espaço.
        // String[] é uma classe que tem um método chamado split, que recebe um argumento,
        // que é o caractere que vai ser usado para separar os elementos da string.
        // Nesse caso, o caractere é o espaço.
        String[] vect = s.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}