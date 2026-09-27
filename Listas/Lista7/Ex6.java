package Lista7_do_while;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu login abaixo ");
        String login = scan.nextLine();
        String acess = login.split(" ")[0];
        do {if (!acess.equals("ADMIN")){
            System.out.println("Acesso negado digite o login novamente");
            login = scan.nextLine();
             acess = login.split(" ")[0];}
        }while (!acess.equals("ADMIN"));
        System.out.println("Acesso permitido Bem vindo "+login);
scan.close();
    }
}
