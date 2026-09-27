package Lista7_do_while;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dia;
        do {
            System.out.println("Digite o dia da última manutenção:");
            dia = scan.nextInt();
            if (dia<1 | dia>31){
            System.out.println("Dia inválido, repita a digitação:");}
        }while(dia<1 | dia>31);
        System.out.println("Data confrmada manutenção em dia ");
        scan.close();
    }
}
