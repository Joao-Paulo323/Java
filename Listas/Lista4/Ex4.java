package Lista4_Revisão;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade e diremos sua classificação como nadador: ");
        int a = scan.nextInt();
        if (a<5 || a>100){
            System.out.println("Vocé não esta apto a competir");
        }
       else if (a <=7){
        System.out.println("Você é infantil");
        }
        else if (a<=17){
            System.out.println("Você é juvenil");
        }
        else{
            System.out.println("Você é Sênior");
        }
scan.close();
    }
}
