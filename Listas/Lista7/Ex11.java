package Lista7_do_while;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, consumo = 0;
        System.out.println("Digite o consumo em KWh:");
        do {
            a= scan.nextInt();
            consumo = a + consumo;
            if(consumo<500){
                System.out.println("Digite o próximo valor de consumo:");
            }
        }while(consumo<500);
        System.out.println("Consumo máximo atingido");

     scan.close();
    }
}
