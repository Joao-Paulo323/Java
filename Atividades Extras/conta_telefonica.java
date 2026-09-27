package Atividades_SENAI;

import java.util.Scanner;

public class conta_telefonica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantos minutos de telefone vocé utilizou esse mes");
        Double n;
        n = scan.nextDouble();
        if (n > 100) {
            n = +((n - 100) * 2) + 50;
            System.out.printf("Vocé tera que pagar um total de R$%.2f%n", n);
        } else {
            System.out.println("Vocé tera que pagar um total de R$50,00");
        }
    }
}
