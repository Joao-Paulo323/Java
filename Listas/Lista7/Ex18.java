package Lista7_do_while;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor,lance,t=0;
        int num;
        System.out.println("Digite o valor da peça abaixo antes de iniciar o leilão");
        valor = scan.nextDouble();
        System.out.println("Registre o seu numero de participante");
        num = scan.nextInt();
        do {
            System.out.println("Digite o valor do lance ");
            lance = scan.nextDouble();
            t = lance + t;
            if (t < valor){
                System.out.println("Novos lances");
            }
        }while (t < valor);
        System.out.printf("Peça vendida para o comprador numero %d no valor de R$%.2f%n",num,t);




        scan.close();
    }
}
