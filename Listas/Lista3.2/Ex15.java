package Lista3_com_condicional_ternaria;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite tres numeros e informaremos se eles formam um triangulo ou não");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        String d = (a + b > c && b + c > a && c + a > b) ?"Esses numeros formam um triangulo" :
                "Esses numeros não formam um triangulo";
        System.out.println(d);
    }
}
