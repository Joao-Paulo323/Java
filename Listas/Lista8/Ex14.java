package Lista8_for;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num,tt,pos=0;
        System.out.println("Digite seis numeros abaixo ");
        for (tt=0; tt<6 ; tt++) {
            num = scan.nextInt();
            pos = (num > 0)?pos+num:pos;

        }
        System.out.println("A soma apenas dos numeros positivos foi de "+pos);
        scan.close();
    }
}
