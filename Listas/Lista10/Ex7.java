package Lista10;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char [] gabarito = {'A','C','E','B','D','A','B','A','E','A','C'};
        char [] respostas = new char[10];
        int b = 0;
        System.out.println("Escreva as alternativas (de A até E) e falaremos quantas estão corretas: ");
        for (int a=0;a<10;a++){
            respostas [a] = scan.next().charAt(0);
        }
        for (int a=0;a<10;a++){
            b = (gabarito[a]==respostas[a])?b+1:b;
        }
        System.out.println("Você acertou um total de "+b+" alternativas");

        scan.close();
    }
}
