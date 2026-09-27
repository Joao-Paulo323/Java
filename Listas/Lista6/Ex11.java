package Lista6_DoWhile;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double a,b,c;
        int d=0,e=0;
        System.out.println("Digite um valor e aplicaremos um imposto de 5% ate que o valor ultrapasse 1000");
        a = scan.nextInt();
        b = a * 0.05;
        c=a;
        do {
            a = a + b;
            d = d+1;
        }while (a<=1000);
        System.out.println("Foram nécessarios "+ d +" repetições no juros simples");
        do {
            b = c *0.05;
            c = c + b;
            e = e + 1;
        }while (c<=1000);
        System.out.println("Foram nécessarios "+ e +" repetições no juros composto");
    }
}
