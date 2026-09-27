package Lista6_DoWhile;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite números e faremos a media de todos os numeros positivos");
        double a;
        double  b = 0,c = 0;
        do {
            System.out.println("Digite um número abaixo para adicionar a media ou digite um numero negativo para parar");
            a = scan.nextInt();
            b = (a > 0)? b+a:b;
            c = (a>0)?c+1:c;
        }
        while (a > 0);
        c = b / c;
        System.out.println("A media dos seus numeros positivos foi de "+c);
        scan.close();
    }
}