package Lista_2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double v1;
        System.out.println("Digite um número e informaremos se é multiplo de 5: ");
        v1 = scan.nextDouble();
        v1 = v1 % 5;
        if (v1 == 0){
            System.out.println("Multiplo de 5");
        }
        else{
            System.out.println("Não é multiplo de 5");
        }
    }
}
