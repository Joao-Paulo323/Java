package Lista7_do_while;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double umidade;
        System.out.println("Digite a porcentagem da umidade do ambiente:");
        do {
            umidade = scan.nextDouble();
            if (umidade<40 | umidade>60){
                System.out.println("Ambiente inadequado, digite a próxima porcentagem:");
            }
        }while(umidade<40 | umidade>60);
        System.out.println("Ambiente adequado");
        scan.close();
    }
}
