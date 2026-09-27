package Lista10;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] vetA = new int [10];
        int [] vetB = new int [10];
        int x;
        System.out.println("Digite 10 numeros abaixo");
        for (int a =0;a<10;a++){
            vetA [a] = scan.nextInt();
        }
        System.out.println("Os numeros selecionados foram: "+ Arrays.toString(vetA));
        System.out.println("Digite um numero para multiplicar os valores escolhidos");
        x =scan.nextInt();
        for (int a =0;a<10;a++){
         vetB [a] =vetA[a] *x;
        }
        System.out.println("Os seus numeros multiplicados por "+x+" foram "+Arrays.toString(vetB));


        scan.close();
    }
}
