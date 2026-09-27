package Lista6_DoWhile;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("Digite uma nota e informaremos se ela é inválida e, se for válida, informaremos a nota: ");
        do {
            a = scan.nextInt();
            if(a>0 & a<10){
                System.out.println("Nota válida, digite a próxima válida");
            }

        }while(a>0 & a<10);
        System.out.println("A nota "+a+" foi inválida ");
    }
}
