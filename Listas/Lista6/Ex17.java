package Lista6_DoWhile;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,max= Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        int b = 0,c = 0;
        System.out.println("Escreva numeros abaixo e iremos te mostrar a soma dos pares: ");
        do{
            System.out.println("Digite o numero abaixo ou digite 0 para parar: ");
            a = scan.nextInt();
            b = (a % 2 == 0)?b+a:b;
        }while (a !=0);
        System.out.println("A soma dos números pares foi "+b);
        scan.close();
    }
}
