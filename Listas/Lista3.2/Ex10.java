package Lista3_com_condicional_ternaria;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois numeros inteiros e falaremos se eles são iguai");
        int a = scan.nextInt();
        int b = scan.nextInt();
        String c = (a == b) ?"Numeros iguais":"Numeros diferentes";
        System.out.println(c);


    }
}
