package Lista6_DoWhile;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        String c;
        System.out.println("Digite seu nome abaixo: ");
        c = scan.nextLine();
        System.out.println("Crie sua senha no campo abaixo");
        a = scan.nextInt();
        System.out.println("Digite sua senha novamente para confirma-la");
        do {
            b = scan.nextInt();
            if (b != a){
                System.out.println("Senha Incorreta digite novamente sua senha");
            }
        }while (b != a);
        System.out.println("Senha correta Bem vindo "+c);
        scan.close();

    }
}
