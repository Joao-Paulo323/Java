package Lista4_revisão;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double d;
        System.out.println("Digite o valor do produto ");
        double a = scan.nextDouble();
        System.out.println("Agora digite qual sera o metodo de pagamento (1: A vista, 2: Cartão de credito, 3: Parcelado)");
        int b = scan.nextInt();
        if (b == 1) {
            d = a - (a * 0.1);
            System.out.printf("Seu produto com o desconto de 10 porcento a vista ira custar R$%.2f%n", d);
        } else if (b == 2) {
            d = a - (a + 0.05);
            System.out.printf("Seu produto com o desconto de 5 porcento a vista ira custar R$%.2f%n", d);
        } else if (b == 3) {
            d = a / 2;
            System.out.printf("Seu produto parcelado ira custar duas vezes de R$%.2f%n", d);
        } else {
            System.out.println("Por favor escolha uma opção valida entra (1,2,3)");
        }

    }
}
