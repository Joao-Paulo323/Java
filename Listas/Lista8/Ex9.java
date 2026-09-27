package Lista8_for;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, cont;
        System.out.println("Digite um numero e mostrarems seu fatorial");
        num = scan.nextInt();
        for (cont = num - 1; cont >= 1; cont--) {
            num = num * cont;
            System.out.println(num);
        }

        scan.close();
    }
}
