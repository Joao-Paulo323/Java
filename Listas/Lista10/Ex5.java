package Lista10;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int [] vet = {1,2,3,4,5,6,7,8,9,0};
        System.out.println("Digite um numero e iremos verificar se ele está no vetor e em qual indice ele está");
        int b=0;
        int num = scan.nextInt();
        for (int a =0 ;a< vet.length;a++){
        if (vet[a] == num){
            System.out.println("Seu numero está dentro dos selecionados ");
            b++;
        }}
        if (b==0){
            System.out.println("Seu numero não esta dentro dos selecionados");
        }
        for (int a=0;a<10;a++){
          if(  vet [a] == num){
              System.out.println("Seu numero está na posição "+a);
          }
        }
        scan.close();
    }
}
