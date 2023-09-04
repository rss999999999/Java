import java.util.Locale;

//A iniciação de variável é necessária para que o compilador saiba que a variável será inicializada

public class IniciacaoVariavel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double price = 400.00;
        double discount;

        if (price < 200.00) {
            discount = price * 0.1;
        } else {
            discount = 0;    //aqui é necessário inicializar a variável, pois o compilador não sabe se o valor será atribuído
        }
        System.out.println(discount);
    }
}