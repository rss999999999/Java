package EstruturaSequencial;

import java.util.Scanner;

public class ReadingData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        String s1, s2, s3;
        x = sc.nextInt();
        s1 = sc.next();
        s2 = sc.next();
        s3 = sc.next();
        sc.close();

        System.out.println("DADOS DIGITADOS:");
        System.out.println("x: " + x);
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
    }
}