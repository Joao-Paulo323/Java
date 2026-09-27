package Lista7_do_while;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a;
        System.out.println("Digite a temperatura de sua extrusora:");
        a = scan.nextDouble();
        do {if (a<180){
            System.out.println("Temperatura baixa digite uma nova temperatura");
            a = scan.nextDouble();}
        }while(a<180);
        System.out.println("Temperatura normal");
    scan.close();}

}
