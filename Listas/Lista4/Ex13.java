package Lista4_revisão;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero e informaremos se  soma dos dois primeiro com os dois ultimos resultam no mesmo numero");
        int n1 = scan.nextInt();
        while (n1 < 1000 || n1 > 9999) {
            System.out.println("Digite um numero valido");
            n1 = scan.nextInt();
        }
        double b = n1 % 100;
        double c = n1 / 100;
        double d = (c + b) * (c + b);
        if (d == n1) {
            System.out.println("Seu numero é um numero magico");
        } else {
            System.out.println("Seu numero não é um numero magico");
        }
    }
}
