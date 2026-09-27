package Lista3_com_condicional_ternaria;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua nota e informaremos se foi aprovado: ");
        String b;
        int a = scan.nextInt();
        b = (a >= 7) ? "Aprovado" : "Reprovado";
        System.out.println(b);
    }
}
