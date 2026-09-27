package Lista3_com_condicional_ternaria;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    String b;
    b = (a >= 0) ? b = "Numero positivo" : "Numero negativo";
        System.out.println(b);
    }
}
