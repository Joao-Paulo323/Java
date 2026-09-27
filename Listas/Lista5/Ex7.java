package Lista5;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b=0,c=0;
        System.out.println("Digite um numero e irei calcular todos os numeros ate o seu");
        int a = scan.nextInt();
        while (c <=a){
            System.out.println(b);
            c = c+1;
            b = b+c;
        }scan.close();
    }
}
