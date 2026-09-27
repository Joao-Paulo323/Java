package Lista6_DoWhile;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 8 números e informaremos a soma dos valores maiores que 50:");
        int a;
        int b = 0,c=1;
        do {
            a = scan.nextInt();
            b = (a >50) ? b + a : b;
           c= c + 1;
        } while (c <=8);
        scan.close();
        System.out.println("A soma dos números maiores que 50 será:" +b);
    }
}