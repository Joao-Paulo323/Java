package Lista3_com_condicional_ternaria;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura: ");
        double t = scan.nextDouble();
       String b = (t < 15)? "Temperatura baixa" :(t <=25)
                            ?"Temperatura agradavel": (t > 25 && t<70)
                            ?"Temperatura quente":"Temperatura mortal";
        System.out.println(b);
    }
}
