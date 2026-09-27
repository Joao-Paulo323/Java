package Lista8_for;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num,div,tt;
        System.out.println("Digite um numero e informaremos todos os seus divisores ");
        num = scan.nextInt();
        for (tt=1; tt <= num; tt++) {
            div = num %tt;
            if (div == 0){
                System.out.println("Seu numero e divisivel por "+tt);
            }
        }
        scan.close();
    }
}
