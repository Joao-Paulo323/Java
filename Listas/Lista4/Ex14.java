package Lista4_revisão;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu salário e calcularemos quanto deve pagar de imposto");
        double a = scan.nextDouble();
        String b = (a <= 2000 && a >0) ? "Isento de imposto seu salario é de R$":
                (a > 2000 && a <= 5000) ? "10% de imposto seu salario é R$":
                        (a > 5000) ? "20% de imposto seu salario é R$ ":"Digite um valor valido";
        double c = (a<= 2000)? a :(a<=5000)? a -(a*0.1) : (a > 5000)? a - (a*0.2):0;
        if (a < 0){
            System.out.println(b);
        }else {
        System.out.printf("%s %.2f%n",b,c);
    }
    }
}
