package Lista7_do_while;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int senha;
        System.out.println("Digite sua senha:");
        do {
            senha = scan.nextInt();
            if(senha!=1234){
                System.out.println("Senha incorreta, tente novamente");
            }
        }while(senha!=1234);
        System.out.println("Senha correta");

    scan.close();}
}
