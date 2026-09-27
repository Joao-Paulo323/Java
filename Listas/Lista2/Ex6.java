package Lista_2;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int v1, v2;
        System.out.println("Digite dois numeros e lhe informaremos qual é o maior: ");
        v1 = scan.nextInt();
        v2 = scan.nextInt();
        if (v1 > v2){
            System.out.println("o maior número é: "+v1);
        } else if (v1 == v2) {
            System.out.println("Os números são iguais");
        }
        else{
            System.out.println("O maior número é: "+v2);
        }
    }
}
