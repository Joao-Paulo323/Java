package Lista_2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ano, v1;
        System.out.println("Digite o ano em que vocé nasceu e o ano atual falaremos se voce e maior de idade ou não");
        ano = scan.nextInt();
        v1 = scan.nextInt();
        if (v1 - ano >= 18) {
            System.out.println("Vocé é maior de idade");
        } else {
            System.out.println("Vocé e menor de idade");
        }
    }
}
