package Lista_2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota1,nota2,media;
        System.out.println("Digite duas notas e diremos se foi aprovado ou reprovado: ");
        nota1 = scan.nextInt();
        nota2 = scan.nextInt();
        media = (nota1 + nota2) / 2;
        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >= 0) {
            System.out.println("Reprovado!");
        } else {
            System.out.println("Vocé foi reprovado com muito sucesso!");
        }
    }
}
