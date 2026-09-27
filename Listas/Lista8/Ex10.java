package Lista8_for;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num,soma=0,media;
        for (media = 0; media<5;media++){
            System.out.println("Digite a nota para adicionara a media");
            num = scan.nextInt();
            while (num<0){
                System.out.println("Digite uma nota valida");
                num = scan.nextInt();
            }
            soma = soma+num;

        }
        soma = soma/media;
        System.out.println("A media das notas foi de "+soma);




        scan.close();
    }
}
