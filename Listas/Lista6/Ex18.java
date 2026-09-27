package Lista6_DoWhile;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int loop=0;
        int a,b=0,c=0;
        System.out.println("Digite numeros abaixo e mostraremos quantos são menores de 20 e quantos são maiores que 50 ");
        do {
        a = scan.nextInt();
        loop = loop +1;
        b = (a > 50)?b + 1:b;
        c = (a<20)? c + 1: c;
        }while (loop <10);
        System.out.println("Teve um total de "+b+" numeros maiores que 50 é "+c+" numeros menores que 20");
    }
}
