package Lista10;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int [] vet =new int [15];
        int maior = Integer.MIN_VALUE,menor =Integer.MAX_VALUE,a;
        System.out.println("Digite 15 numeros e te mostraremos qual e o maior e o menor e onde eles estão");
        for (a=0;a<15;a++){
         vet [a] = scan.nextInt();
         maior =(vet[a]>maior)?vet[a]:maior;
         menor =(vet[a]<menor)?vet[a]:menor;
        }
        for (a=0;a<15;a++){
        if (vet[a] == maior){
            System.out.println("O maior numero é "+maior+" e está na posição "+a);
        }if (vet[a] == menor){
                System.out.println("O menor numero é "+menor+" e está na posição "+a);
            }
        }
        scan.close();
    }
}
