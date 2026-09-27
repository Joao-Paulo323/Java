package Lista3_com_condicional_ternaria;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o preço do produto: ");
        double p = scan.nextDouble();
        double d = (p < 100) ? p = p - (p * 0.1) : p;
        System.out.printf("O valor que vocé devera pagar e R$%.2f%n", p);

    }
}
