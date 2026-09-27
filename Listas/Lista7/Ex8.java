package Lista7_do_while;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("Informe o estado do sistema digite (0) se estiver ok ou (1) se estiver avendo uma emergencia");
do {a = scan.nextInt();
    while (a >1 | a<0){
        System.out.println("Digite uma opção valida (0) ok ou (1) Emergencia");
        a = scan.nextInt();
}if (a == 0){
    System.out.println("Tudo normal digite novamente o estado do progama");}
}while (a == 0);
        System.out.println("Emergencia detectada progama encerrado");
    scan.close();
    }
}
