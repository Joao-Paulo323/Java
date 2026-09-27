package Lista8_for;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont,num, par=0;
        System.out.println("Digite dez numeros e informaremos quantos são par numero: ");
        for (cont = 1; cont <= 10; cont++) {
           num = scan.nextInt();
            par =(num % 2 == 0)?par + 1:par;
        }
        System.out.println("Teve um total de "+par+" numeros pares");
        scan.close();
    }
}
