package Lista6_DoWhile;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,max= Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        System.out.println("Escreva numeros abaixo e iremos te mostrar qual e o maior e o menor numero digitado");

        do{
            System.out.println("Digite o numero abaixo ou digite 0 para parar ");
            a = scan.nextInt();
            max = (a > max& a!=0 )?a : max;
            min =(a<min & a!= 0 )? a : min;

        }while (a !=0);
        System.out.println("O maior numero é o "+max+" e o menor numero é o "+min);

    }
}
