package Lista4_Revisão;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero e verificareos se ele esta entre 100 e 200 ou se ele e maior ou menor que esse intervalo");
        int a = scan.nextInt();
        String b =(a >100 && a <200)? "Seu numero esta entre 100 e 200":(a >200)
                ?"Seu numero e maior que 200":"Seu numero e menor q ue 100";
        System.out.println(b);
scan.close();
    }
}
