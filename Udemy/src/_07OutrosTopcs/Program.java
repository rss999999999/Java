package _07OutrosTopcs;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //aqui, o 6º bit é 1, os outros são 0
        //int mask = 0b100001;  //aqui uso o & para testar se o 6º bit ou o 1º bit é 1 ou 0.
        int mask = 0b100000;
        int n = sc.nextInt();

        //aqui, o operador & é usado para testar se o 6º bit é 1 ou 0
        //o n&mask é 0 se o 6º bit for 0, caso contrário, é diferente de 0
        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        }
        else {
            System.out.println("6th bit is false");
        }
        sc.close();
    }
}
