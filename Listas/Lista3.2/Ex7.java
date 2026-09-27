package Lista3_com_condicional_ternaria;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite três números inteiros e informaremos qual o maior: ");
        int m;
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        m = (a > b && a > c) ? a : (b > c) ? b : c;
        System.out.println("O maior numero é o "+m);


    }
}
