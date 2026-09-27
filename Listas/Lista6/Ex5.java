package Lista6_DoWhile;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        do {
            System.out.println("Digite um numero e iremos mostrar qual e o dobro desse numero");
            a = scan.nextInt();
            b = a*2;
            System.out.println("O dobro do numero "+a+" é "+b);
        }while (a != 0);




    }
}
