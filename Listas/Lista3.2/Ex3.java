package Lista3_com_condicional_ternaria;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius: ");
        double t = scan.nextDouble();
        String d = (t > 40) ? d = "Temperatura extremamente alta" : "Temperatura normal";
        System.out.println(d);
    }
}
