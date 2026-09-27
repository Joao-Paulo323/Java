package Lista10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] vet = new  int[12];
        int num;
        System.out.println("Digite 12 numeros e exibiremos os numeros da primeira parte na segunda parte e da segunda parte na primeira");
        for (int i =0;i<12;i++){
            vet [i] = scan.nextInt();
        }
        for (int i =0;i<6;i++){
            num =vet[i];
            vet [i] = vet [i+6];
            vet [i+6] = num;
        }for (int i : vet){
            System.out.println(i);
        }

        scan.close();
    }
}