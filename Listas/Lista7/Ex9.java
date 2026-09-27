package Lista7_do_while;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome, senai;
        System.out.println("Digite o prefixo de seu crachá:");
        do {
            nome = scan.nextLine();
            senai=nome.split(" ")[0];
            if (!senai.equals("SENAI")){
                System.out.println("Prefixo errado, tente novamente");
            }
        }while (!senai.equals("SENAI"));
        System.out.println("Acesso autorizado");
      scan.close();
    }
}
