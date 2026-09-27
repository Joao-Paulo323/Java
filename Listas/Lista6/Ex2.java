package Lista6_DoWhile;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite números e informaremos quantos valores são maiores que 10:");
        int a;
        int b = 0;
        do {
            System.out.println("Digite um número abaixo ou digite 0 para saber quantos valores foram maiores que 10");
        a = scan.nextInt();
        b = (a > 10)? b + 1:b;

        }
        while(a != 0);
        System.out.println("Tivemos um total de: "+b+" números maiores que 10");
        scan.close();

    }
}
