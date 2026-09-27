package Lista4_Revisão;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 numeros para vermos o maior.");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int a = (n1>n2 && n1>n3)? n1 :(n2>n3)? n2:n3;
        System.out.println("O maior numero é: "+a);
sc.close();
    }
}
