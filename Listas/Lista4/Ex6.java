package Lista4_Revisão;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite dois numeros e um caractere e faremos a conta para vocé");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        String c = scan.next();
        double d =(c .equals("+")) ? a+b :(c .equals("-"))
                ? a - b : (c .equals("*"))
                ? a*b :(c .equals("/"))? a/b:0;
        System.out.println("O resultado do seu calculo foi de "+d);
scan.close();
    }
}
