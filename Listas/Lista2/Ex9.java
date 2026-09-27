package Lista_2;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double v1,v2;
        System.out.println("Digite o valor da compra no campo abaixo");
        v1 = scan.nextDouble();
        if (v1 > 100){
            v2 = v1 - (v1 *0.1);
            System.out.printf("O valor da sua compra com desconto de dez porcento deu R$%.2f%n",v2);
        }
        else {
            System.out.printf("O valor da sua compra deu R$%.2f%n",v1);
        }
    }
}
