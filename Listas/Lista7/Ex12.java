package Lista7_do_while;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String condicao;
        int erro=0;
        do {
            System.out.println("Digite a condição da proxima peça, (ok) para peças boas ou (def) para peças com defeito");
            condicao = scan.next();
            while (!condicao.equals("ok") & !condicao.equals("def")){
                System.out.println("Digite uma opção valida");
                condicao = scan.next();
            }
            erro =(condicao . equals("def"))?erro + 1:erro;

        }while (erro<5);
        System.out.println("Limite de peças com defeito atingido produção pausada");




        scan.close();
    }
}
