import java.util.Scanner;

public class LerDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2, s3;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        sc.close();

        float x;
        x = (int) Math.pow(5, 2);
        System.out.println(x);

        // Check if x is an integer
        if (x == (int) x) {
            System.out.println("Type of x: int");
        } else {
            System.out.println("Type of x: float");
        }
    }
}

