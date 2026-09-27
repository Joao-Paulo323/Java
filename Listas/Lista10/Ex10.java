package Lista10;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] vet =new int[10];
        int [] vet2 =new int[10];
        int soma=0;
        System.out.println("Digite 10 numeros e criaremos um vetor que mostrara a soma dos seus numero");
        for (int i=0;i<10;i++){
            vet [i] = scan.nextInt();
            soma += vet[i];
            vet2 [i]=soma;
        }
        System.out.println("A soma dos seus numeros em um vetor é "+ Arrays.toString(vet2));






        scan.close();
    }
}
