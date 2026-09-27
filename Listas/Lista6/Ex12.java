package Lista6_DoWhile;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,b=0;
        System.out.println("Digite um numero e iremos dividir esse numero por 2 ate o maximo de repeições possiveis");
       a = scan.nextDouble();
        do {
            a = a / 2;
            b = b+1;
        }while (a >1);
        System.out.println("Teve um total de "+b+" repetições");
        scan.close();
    }
}
