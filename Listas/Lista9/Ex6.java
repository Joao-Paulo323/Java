package Lista9;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int [] vet = new int[5];
        int a;
        System.out.println("Digite 5 numeros e exibiremos eles na ordem inversa");
        for (a=0;a<5;a++){
            vet[a] = scan.nextInt();
        }
        System.out.println("Seus numeros na ordem inversa são");
        for (a = vet.length-1;a>=0;a--){
            System.out.println(vet [a]);
        }

scan.close();
    }
}
