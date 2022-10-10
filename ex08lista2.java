import java.util.Scanner;

public class ex08lista2 {
    public static void main(String[] args) {
        double preço1, preço2, preço3;
        Scanner teclado = new Scanner(System.in);

        System.out.println(" Digite o preço do produto 1 ");
        preço1 = teclado.nextDouble();

        System.out.println(" Digite o preço do produto 2 ");
        preço2 = teclado.nextDouble();

        System.out.println(" Digite o preço do produto 3 ");
        preço3 = teclado.nextDouble();

        teclado.close();

        if (preço1 < preço2 && preço1 < preço3) {
            System.out.println(" o melhor produto para compra é o que custa R$ " + preço1);
        } else if (preço2 < preço1 && preço2 < preço3) {
            System.out.println(" o melhor produto para comprar é o que custa R$ " + preço2);
        } else if (preço3 < preço1 && preço3 < preço2) {
            System.out.println(" o melhor produto para compra é o que custa R$ " + preço3);
        }
    }
}
