package Lista8_for;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont, num, maior = Integer.MIN_VALUE;
        System.out.println("Digite 5 numeros e iremos informar qual é o maior");
        for (cont = 0; cont < 5; cont++) {
            num = scan.nextInt();
            maior = (num > maior) ? num : maior;

        }
        System.out.println("O maior numero é o " + maior);
        scan.close();
    }
}
