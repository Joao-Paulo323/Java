package Lista10;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        double [] vet = new double[10];
        double soma=0;
        int a;
        System.out.println("Digite 10 numeros abaixo e faremos a soma para vocé");
        for (a=0;a<10;a++){
            vet [a] = scan.nextDouble();
            soma +=vet[a];
        }
        soma = soma/a;
        System.out.printf("A media dos seus numeros é: %.2f%n",soma);

        scan.close();
    }
}
