package Lista3_com_condicional_ternaria;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu salario abaixo");
        double n = scan.nextDouble();
        String a = (n >= 2000) ? a = "Salario alto" :   "Salario baixo";
        System.out.println(a);

    }
}