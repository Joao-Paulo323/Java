package Lista9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,maior = Integer.MIN_VALUE,menor = Integer.MAX_VALUE;
        int [] vect = new int[5];
        System.out.println("Digite 5 numeros e falaremos qual e o maior e qual o menor");
        for (a = 0;a<5;a++){
         vect [a] = scan.nextInt();
         maior = (vect [a] > maior)?vect [a]:maior;
         menor = (vect [a]< menor)?vect [a]:menor;
        }
        System.out.println("Seus numeros foram: "+ Arrays.toString(vect)+" e seu maior numero foi "+maior+" e seu menor numero foi "+menor);
    }
}
