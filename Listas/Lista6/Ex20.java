package Lista6_DoWhile;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        double compra,total=0 ,desconto=0;

        System.out.println("Digite seu nome no campo abaixo");
        nome = scan.nextLine();

        do {
            System.out.println("Digite o valor do produto abaixo ou digite 0 para ver o total da compra");
            compra = scan.nextDouble();
            total = total + compra;
        }while (compra!=0);

        scan.close();

        desconto = (total >500)?total * 0.1:desconto;

        if (total>500){

            System.out.println("Vocé recebeu um cupom de 10% na sua compra  ");
            compra = total - desconto;
            System.out.printf("%s o total da sua compra foi de R$%.2f%n vocé recebeu R$%.2f%n de desconto o total com o desconto foi de R$%.2f%n",nome,total,desconto,compra);
        }else {

            System.out.printf("%s o total da sua compra foi de R$%.2f%n",nome,total);
        }
    }
}
