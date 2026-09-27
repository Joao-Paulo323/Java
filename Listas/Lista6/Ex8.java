package Lista6_DoWhile;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite números e informaremos quantos valores são multiplos de 5");
        int a;
        int b = 0;
        do {
            System.out.println("Digite um número abaixo ou digite 0 para saber quantos valores foram multiplos de 5");
            a = scan.nextInt();
            b = (a % 5==0 & a!=0)? b + 1:b;

        }
        while(a != 0);
        System.out.println("Tivemos um total de: "+b+" números multiplos de 5");
        scan.close();

    }
}
