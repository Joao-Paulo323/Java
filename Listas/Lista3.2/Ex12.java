package Lista3_com_condicional_ternaria;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite tres numeros e informaremos qual e o maior e qual e o menor ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        String d = (a > b && a > c) ? "O maior numero é o " + a : (b > c)
                ? "O maior numero é o " + b : "O maior numero é o " + c;
        String e = (a < b && a < c)
                ? "e o menor numero é o " + a : (b < c)
                ? "e o menor numero é o " + b : "e o menor numero é o " + c;
        System.out.println(d +" "+e);

    }
}
