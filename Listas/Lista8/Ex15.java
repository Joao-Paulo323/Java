package Lista8_for;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num,cont,tt=0;
        System.out.println("Digite oito numeros e informaremos quantos são maiores que 50");
        for (cont=0;cont<8;cont++){
        num = scan.nextInt();
        tt = (num > 50)?tt + 1:tt;
        }
        System.out.println("Teve um total de "+tt+" numeros maiores que 50");
        scan.close();
    }
}
