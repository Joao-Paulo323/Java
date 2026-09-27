package Lista4_Revisão;

import java.util.Scanner;

public class Ex3 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite os 3 numeros para vermos se formam um triangulo.");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    String d=(a+b>c && b+c>a && c+a>b)
            ?"Estes numeros formam um triangulo.":"Estes numeros nao formam triangulo.";
    String e =(a == b & b == c) ? "Seu tringulo e Equilátero" : (a == b || b == c || a ==c)
            ? "Seu triangulo é Isoceles" : "Seu triangulo e Escaleno";
    System.out.println(d);
    System.out.println(e);
sc.close();
    }
}

