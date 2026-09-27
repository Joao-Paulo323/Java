package Lista6_DoWhile;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b=0,c=0;


        System.out.println("Digite um numero abaixo e nos iremos calcular todos os numeros maiores que 100");
        do {
        a = scan.nextInt();
        b = (a > 100)?b + a:b;
        c=(a>100)?c+1:c;
            System.out.println("Digite o proximo numero abaixo ou digite 0 para parar");
        }while(a!=0);
        scan.close();
        b=b/c;
        System.out.println("A media dos numeros maiores que 100 deu "+b);

    }
}
