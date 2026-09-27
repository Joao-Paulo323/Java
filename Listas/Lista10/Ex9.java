package Lista10;

import java.util.Scanner;
import java.util.Vector;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        char [] vet =new char [15] ;
        int cont=0;
        System.out.println("Digite 15 letras maiusculas e mostraremos quantos são vogais");
        for (int i =0;i<15;i++){
            vet [i] =scan.next().charAt(0);
            if (vet [i] == 'A'|vet[i]=='E'|vet[i]=='I'|vet[i]=='O'|vet[i]=='U'){
                cont++;
            }
        }
        System.out.println("Teve um total de "+cont+" vogais");

        scan.close();
    }
}
