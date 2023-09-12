package _07OutrosTopcs;

public class Vetores {
    public static void main(String[] args) {
        // Declaração e inicialização de um vetor de inteiros com tamanho 5
        // Se você tentar acessar um índice fora dos limites do vetor, como vetor[3], ocorrerá uma exceção ArrayIndexOutOfBoundsException, pois o vetor tem apenas 3 elementos e o índice 3 está fora do intervalo válido.
        // Portanto, ao alterar o tamanho do vetor, certifique-se de ajustar as atribuições e acessos aos elementos do vetor para evitar índices fora dos limites.
        int[] vetor = new int[5];

        // Atribuição de valores aos elementos do vetor
        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;
        vetor[4] = 50;

        // Acessando e exibindo os elementos do vetor
        System.out.println("Elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}

/*
    Neste exemplo, um vetor de inteiros chamado vetor é declarado e inicializado com tamanho 5.
    Em seguida, os valores são atribuídos aos elementos do vetor usando índices de 0 a 4.
    Por fim, um loop for é usado para percorrer o vetor e exibir os elementos na saída.
    Lembre-se de que os índices de um vetor em Java começam em 0, então o primeiro elemento é acessado usando vetor[0],
    o segundo elemento usando vetor[1] e assim por diante. O tamanho do vetor pode ser obtido usando a propriedade length.
*/
