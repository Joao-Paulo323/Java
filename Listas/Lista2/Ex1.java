package Lista_2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v1;
        System.out.println("Digite um número e informaremos se ele é par ou impar: ");
        v1 = scan.nextInt();
        v1 = v1 % 2;
        if (v1 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número impar");
        }

    }
}
