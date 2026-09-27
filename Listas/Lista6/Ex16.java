package Lista6_DoWhile;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite números e informaremos quantos estão entre 10 e 50");
        int a;
        int b = 0;
        do {
            System.out.println("Digite um numero abaixo ou digite 0 para parar");
            a = scan.nextInt();
            b = (a >=10 & a <= 50) ? b + 1 : b;
        } while (a !=0);
        scan.close();
        System.out.println("Tem um total de:" +b+" numeros ente 10 e 50");
    }
}
