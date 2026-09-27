package Lista10;

import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random OptimusPrime = new Random();
        int[] vet = new int[20];
        int [] vet2 =new int[20];
        int a,cont=0;
        System.out.println("Geraremos 20 numeros aleatórios e mostraremos os números pares.");
        for (a=0;a<20;a++){
        vet[a] =OptimusPrime.nextInt(200);
            if (vet[a] % 2 == 0){
                vet2 [cont] =vet[a];
                cont++;
            }
        }
        System.out.println("Os seus numeros pares são");
        for (a = 0; a < cont; a++) {
        System.out.println(vet2[a]+" ");}

        scan.close();
    }
}
