package Lista7_do_while;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double temp,prod,disp;
        int loop=1;
        do {
            System.out.println("Digite o tempo total que a máquina "+loop+" ficou ligada:");
            temp = scan.nextInt();
            System.out.println("Agora digite o tempo em que a máquina ficou produzindo");
            prod = scan.nextInt();
            loop++;
            disp = prod / temp;
            if (loop <=3){
            System.out.printf("A disponibilidade da maquina %d é de %.2f%n",loop,disp);}
        }while (loop <= 3);


    scan.close();
    }
}
