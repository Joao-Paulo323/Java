package Lista5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int b= 0;
        System.out.println("Digite um numero e mostrarei todos os multiplos de 5 ate esse numero");
        int a= scan.nextInt();
        while (b <= a){
            System.out.println(b);
            b = b + 5;
        }
        scan.close();

    }
}
