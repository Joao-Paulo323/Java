package Lista_2;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double v1;
        System.out.println("Digite um numero e iremos informar se ele e positivo ou negativo");
        v1 = scan.nextDouble();
        if (v1 > 0) {
            System.out.println("Seu numero e positivo");
        } else if (v1 == 0) {
            System.out.println("Seu numero é 0");
        } else {
            System.out.println("Seu numero e negativo");
        }


    }
}
