package Lista5;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = 0, b = 0, loop = 1;
        System.out.println("Digite 5 notas e informaremos a média aritmética: ");
        while (loop <= 5){
            a = scan.nextInt();
            b = b + a;
            loop = loop + 1;
        } b = b/5;
        System.out.printf("A média de suas notas foi de %.2f%n",b);
scan.close();
    }
}
