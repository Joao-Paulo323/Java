package Lista7_do_while;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a pressão da caldeira em psi e converteremos em bar 1 BAR equivale a 14,5 PSI ");
       double Bar;
        double pres = scan.nextDouble();
        do{
            Bar = pres * 0.0689;
        if (Bar<10){
            System.out.println("Pressão baixa por favor digite novamente");
            pres = scan.nextDouble();
        }
        }while (Bar < 10);
        System.out.printf("A pressão informada esta ok sua pressão esta em %.2f%n",pres);
scan.close();

    }
}
