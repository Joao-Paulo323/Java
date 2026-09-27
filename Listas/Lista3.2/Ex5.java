package Lista3_com_condicional_ternaria;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int id = scan.nextInt();
        if (id < 0 ||id > 130) {
            System.out.println("Idade invalida");
        } else {
            String id2 = (id >= 16) ? id2 = "Voce pode votar" : "Vocé não pode votar ";
            System.out.println(id2);
        }
    }
}
