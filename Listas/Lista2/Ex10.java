package Lista_2;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int senha,senha1;
        System.out.println("Crie a sua senha abaixo");
        senha = scan.nextInt();
        System.out.println("Agora digite a sua senha novamente");
        senha1 = scan.nextInt();
        if (senha == senha1){
            System.out.println("Acesso permitido");
        }else {
            System.out.println("Acesso negado senha incorreta");
        }
    }
}
