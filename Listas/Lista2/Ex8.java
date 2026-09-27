package Lista_2;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double v1, v2, soma;
        System.out.println("Digite dois números e informaremos se o primeiro é divisível pelo segundo");
        v1 = scan.nextDouble();
        v2 = scan.nextDouble();
        scan.close();
        soma = v1 % v2;
        if (soma == 0) {
            System.out.println("Divisão exata");
        } else {
            System.out.println("O resto da divisão é: " + soma);
        }
    }
}
