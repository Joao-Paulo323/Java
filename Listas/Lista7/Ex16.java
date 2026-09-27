package Lista7_do_while;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a= 100, b;
        int loop = 0;
        do {
            System.out.println("Digite a quantidade de matéria prima usada:");
            b = scan.nextInt();
            a = a - b;
            System.out.println("Digite a próxima quantidade de matéria prima a ser usada sabendo que atualmente possui "+a+" quantidades de materias primas");
        }while(a>10);
        System.out.println("Quantidade de matéria prima muito baixa.");
        scan.close();
    }
}
