package Lista10;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] vet =new String[10];
        int a;
        System.out.println("Digite o nome de dez alunos abaixo ");
        for (a=0;a<10;a++){
            vet [a] = scan.next();
        }
        System.out.println("O nome dos seus alunos na ordem inversa é: ");
        for (a = vet.length-1;a>=0;a--){
            System.out.println(vet[a]+" ");
        }
    scan.close();
    }
}
