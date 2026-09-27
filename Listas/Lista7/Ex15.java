package Lista7_do_while;

import java.util.Scanner;

public class Ex15 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int hora,total=0;

            do {
                System.out.println("Sabendo que o tempo de voo total atual é " +total+" horas.");
                System.out.println("Digite quantas horas de voo o drone efetuara sabendo que a cada 20 horas tem que haver uma manutenção.");
                hora = scan.nextInt();
                total = hora + total;
            }while (total <20);
            if (total > 30){
                System.out.println("o total de horas de voo se excedeu muito faça a manutenção imediatamente");}
            else {
                System.out.println("Hora maxima de voo atingida por favor realize a manutenção");
            }
            scan.close();
    }
}

