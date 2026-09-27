package Lista_2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v1;
        System.out.println("Digite um número e informaremos se ele e divisivel por 2 e por 3");
        v1 = scan.nextInt();
        if (v1 % 2 == 0 && v1 % 3 == 0) {
            System.out.println("Seu numero e divisivel por 2 e por 3 ao mesmo tempo");
        } else {
            System.out.println("Seu numero não e divisivel por 2 e por 3 ao mesmo tempo");
        }
    }
}
