package Lista4_Revisão;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1,l2,l3;
        String a;
        System.out.println("Digite os 3 numeros para vermos se formam um triangulo.");
        l1 = sc.nextInt();
        l2 = sc.nextInt();
        l3 = sc.nextInt();
        a=(l1+l2>l3 && l2+l3>l1 && l3+l1>l2)
                ?"Estes numeros formam um triangulo.":"Estes numeros nao formam triangulo.";
        System.out.println(a);
        sc.close();
    }
}
