package Lista6_DoWhile;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número para ser o teto: ");
        int a = scan.nextInt();
        int b,c=0;
        System.out.println("Agora digite numeros e faremos a conta ate ultrapassar o limite");
        do{
            System.out.println("Digite o numero abaixo");
           b= scan.nextInt();
           c = c + b;
            System.out.println("Asoma dos numeros deu "+c);


    }while(c <= a);

    scan.close();
}
}
