package Lista3_com_condicional_ternaria;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um ano e informaremos se ele é bissexto: ");
        String b;
        int a = scan.nextInt();
        b = (a % 4 != 0) ?"Seu ano não é bissexto" : (a % 100 != 0)? "Seu ano é bissexto":"";
        System.out.println(b);
    }
}
