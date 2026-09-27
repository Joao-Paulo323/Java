package Lista8_for;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, cont, soma=0;
        System.out.println("Digite um numero positivo e faremos a soma de todos os numeros ate ele ");
        num = scan.nextInt();
        for (cont = 0; cont<=num;cont++){
            soma = soma + cont;
            System.out.println(soma);
        }
    }
}
