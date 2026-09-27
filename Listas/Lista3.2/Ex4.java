package Lista3_com_condicional_ternaria;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int id = scan.nextInt();
        if (id < 0 ||id > 130) {
            System.out.println("Idade invalida");
        } else {
            String id2 = (id >= 18) ? id2 = "Vocé e maior de idade" : "Vocé é menor de idade ";
            System.out.println(id2);
        }
    }
}
