package Lista7_do_while;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int loop = 1;
        int peca,media=0;
        System.out.println("Digite a quantidade de pessas produzidas no "+loop+"° turno");
        do {
            peca = scan.nextInt();
            media = media + peca;
            loop++;
            if (loop <=5){
            System.out.println("Digite a quantidade de pessas produzidas no "+loop+"° turno");}
        }while (loop <=5);
        loop = loop - 1;
        media = media / loop;
        System.out.println("A media das peças produzidas nos "+loop+" foram "+media);

     scan.close();
    }
}
