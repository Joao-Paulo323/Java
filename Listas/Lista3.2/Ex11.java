package Lista3_com_condicional_ternaria;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número e informaremos se ele é divisível por 5: ");
        double a = scan.nextDouble();
        String b = (a % 5 == 0)? "Divisivel por 5" : "Não é divisivel por 5";
        System.out.println(b);
    }
}
