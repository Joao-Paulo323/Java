package Lista4_revisão;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número e informaremos se é par e menor que 100 ou impar e maior que 100");
        int a = scan.nextInt();
        String b = (a % 2 == 0 && a < 100) ? "Número par e menor que 100":
                (a % 2 != 0 && a > 100) ? "Número ímpar e maior que 100":
                        "Numero não atende as condiçoes propostas ";
        System.out.println(b);

    }
}

