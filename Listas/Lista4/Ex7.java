package Lista4_Revisão;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número e informaremos se é multiplo de 7 ou de 11");
    int a = scan.nextInt();
    if (a % 7 == 0){
        System.out.println("Multiplo de 7");
    }
    else if (a % 11 == 0){
        System.out.println("Multiplo de 11");
    }
    else{
        System.out.println("Não é multiplo de 7 nem de 11");
    }scan.close();
    }
}
