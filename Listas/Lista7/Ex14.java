package Lista7_do_while;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int peso,total=0;

        do {
            System.out.println("Digite qual o valor do proximo peso que deseja adicionar sabendo que o peso atual esta em "+total+"kg e o peso maximo é 1000kg");
            peso = scan.nextInt();
            total = peso + total;
        }while (total <1000);
        if (total > 1500){
        System.out.println("O peso colocado superou muito o limite e o carro não conseguira andar");}
        else {
            System.out.println("Peso maximo atingido");
        }
        scan.close();
    }
}
