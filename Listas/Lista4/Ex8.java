package Lista4_Revisão;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo a calculadora de IMC");
        System.out.println("Digite seu peso");
        double a = scan.nextDouble();
        System.out.println("Agora digite sua altura");
        double b = scan.nextDouble();
        String c= ( a / (b * b)< 18.5) ? "Voce esta a baixo do peso" :
                (a / (b*b) <=24.9 ) ? "Vocé está com o peso normal" :
                        (a / (b*b) <= 29.9) ? "Vocé esta com sobrepeso" :
                                (a / (b*b) <=34.9 )?"Vocé está com obesidade classe 1 ":
                                        (a / (b*b) <=39.9)?"Vocé esta com obesidade classe 2":
                                                (a / (b*b) >= 40 && a / (b*b) <100) ? "Voce esta com obesidade classe 3":
                                                        "Valor invalido por favor cocloque um valor valido";
        System.out.println(c);
scan.close();



    }
}
