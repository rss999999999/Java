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

        int j=10;
        int w=5;
        j=w++; //na primeira iteração o w mantêm o valor 5
        System.out.println("j = " + j);
        System.out.println("w = " + w); //na segunda iteração o w recebe o valor 6

    }
}
