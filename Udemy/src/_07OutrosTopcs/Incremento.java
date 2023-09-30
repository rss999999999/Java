package _07OutrosTopcs;

public class Incremento {
    public static void main(String[] args) {

        int c = 10;
        System.out.println(c--);
        System.out.println(c);
        System.out.println("----------");

        int d = 10;
        System.out.println(--d);
        System.out.println(d);
        System.out.println("----------");

        int x = 10;
        int y = x++;
        System.out.println(x);
        System.out.println(y);
        System.out.println("----------");

        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println("----------");
    }
}
