package Lista9;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,soma=0;
        int [] vetor = new  int [5];
        System.out.println("Digite 5 numeros e faremos a soma para vocé");
        for (a=0; a<5;a++){
            vetor [a]= scan.nextInt();
            soma += vetor[a];
        }
        System.out.println("A soma dos seus numeros é: " +soma);
        scan.close();
    }
}
