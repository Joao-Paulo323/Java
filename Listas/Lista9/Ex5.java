package Lista9;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,c;
        String b;
        int [] vet = {10,1,13,17,67};
        System.out.println("Digite um número e informaremos se ele está dentro do vetor: ");
        a = scan.nextInt();
        for (c = 0;c<vet.length;c++){
           if (vet[c] == a){
               System.out.println("Seu numero esta dentro do vetor");
               break;
           }else {
               System.out.println("Seu numero esta fora do vetor");
               break;
           }
        }
scan.close();
    }
}
