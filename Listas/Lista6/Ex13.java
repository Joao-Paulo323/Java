package Lista6_DoWhile;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b=0, cont=0;
        System.out.println("Escreva numeros abaixo e iremos te mostrar quantos foram digitados, a soma dos números e a média:");

        do {
            System.out.println("Digite o numero abaixo ou digite 0 para parar: ");
            a = scan.nextInt();
            if (a!=0){
            b =b+a;
            cont++;}
        }while(a!=0);
        scan.close();
        a = b/cont;
        System.out.println("Você digitou um total de "+cont+" números, a soma foi "+b+" e a média foi de "+a);

    }
}