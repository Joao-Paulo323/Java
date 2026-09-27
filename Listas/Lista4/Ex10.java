package Lista4_revisão;

import java.util.Scanner;
//Leia a hora de início e de fim de um jogo (horas inteiras).
//Se o fim for menor que o início, considere que o jogo terminou no dia
//seguinte e calcule a duração total.
public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite as horas em que vocé começou a jogar ");
        int a = scan.nextInt();
        System.out.println("Agora digitem as horas em que voce terminou de jogar ");
        int b = scan.nextInt();
        int c = (a > b && a >= 0 && b >= 0 && a<=24 && b<=24 ) ? (b + 24 ) - a :
                (a < b && a <= 24 && b <= 24 && a>+0 && b>= 0)? b - a : 0;
        if (a > b && c !=0){
            System.out.println("Vocé jogou por 1 dia e ao todo vocé ficou "+c+" horas jogando");
        } else if (a < b && c!=0 ) {
            System.out.println("Vocé ficou jogando por "+c+" horas");
        }else {
            System.out.println("Horas invalidas");
        }
        scan.close();

    }
}
