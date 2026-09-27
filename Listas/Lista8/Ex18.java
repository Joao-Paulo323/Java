package Lista8_for;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, primo = 0, div;
        System.out.println("Digite um numero e falaremos se ele e priomo ou não");
        num = scan.nextInt();
        for (div = 1; div <= num; div++) {
            primo = (num % div == 0) ? primo + 1 : primo;
        }
        if (primo == 2) {
            System.out.println("Seu numero é primo");
        } else {
            System.out.println("Seu numero não é primo");
        }
        scan.close();
    }
}
