package Atividades_SENAI;

import java.util.Locale;

public class testes_de_funçoes {
    public static void main(String[] args) {
        int age = 30, code = 5290;
        String product1 = "computador", product2 = "mesa de escritorio";
        char genero = 'F';
        double preco1 = 2100, preco2 = 650, numerod = 53.234567;
        System.out.printf("O produto %s esta custando R$%.2f%n", product1, preco1);
        System.out.printf("O produto %s esta custando R$%.2f%n", product2, preco2);
        System.out.printf("Gravando variaveis : idade %d , codigo %d e genero: %c%n", age, code, genero);
        System.out.printf("Numero decimal com oito casas %.8f%n", numerod);
        System.out.printf("Numero decimal com 3 casas %.3f%n", numerod);
        Locale.setDefault(Locale.US);
        System.out.printf("Numero decimal no US %.3f%n", numerod);
    }
}
