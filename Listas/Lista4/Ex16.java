package Lista4_revisão;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número e informaremos se é divisível por 2, 3 e 5 ao mesmo tempo");
        double a = scan.nextDouble();
        String b = (a % 2 == 0 && a % 3 == 0 && a % 5 == 0) ? "Seu número é divisível por 2, 3 e 5 ao mesmo tempo" :
                "Seu número não é divisível por 2, 3 e 5 ao mesmo tempo";
        System.out.println(b);
    }
}
