package _07OutrosTopcs;
import java.util.Scanner;


public class QualNumeroMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, maior;
        System.out.println("Digite 3 números inteiros:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        maior = max(n1, n2, n3);
        showResult(maior);
        sc.close();
    }
    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        }
        else if (y > z) {
            aux = y;
        }
        else {
            aux = z;
        }
        return aux;
    }
    public static void showResult(int value) {
        System.out.println("Maior = " + value);
    }
}

//a diferença entre o public static void e o public static int é que o primeiro não retorna nada, enquanto o segundo retorna um valor inteiro.