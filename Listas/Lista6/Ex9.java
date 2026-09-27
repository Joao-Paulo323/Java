package Lista6_DoWhile;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 8 números e informaremos quantos estão entre 20 e 80");
        int a;
        int b = 0;
        do {
            System.out.println("Digite um numero abaixo ou digite 0 para parar");
            a = scan.nextInt();
            b = (a >=20 & a <= 80) ? b + 1 : b;
        } while (a !=0);
        scan.close();
        System.out.println("Tem um total de:" +b+" numeros ente 20 e 80");
    }
}