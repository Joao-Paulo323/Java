package Lista8_for;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont, num, menor = Integer.MAX_VALUE;
        System.out.println("Digite 5 numeros e iremos informar qual é o menor");
        for (cont = 0; cont < 5; cont++) {
            num = scan.nextInt();
            menor = (num < menor) ? num : menor;

        }
        System.out.println("O menor numero é o " + menor);
        scan.close();
    }
}
