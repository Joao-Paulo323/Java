package Lista8_for;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num,cont;
        System.out.println("Digite um numero positivo e o progama fara uma contagem ate esse numero");
        num = scan.nextInt();
        while (num < 0){
            System.out.println("Digite um numero positivo valido");
            num = scan.nextInt();
        }
        for (cont = 0;cont <=num;cont++){
            System.out.println(cont);
        }



        scan.close();
    }
}
