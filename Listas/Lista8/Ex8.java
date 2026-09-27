package Lista8_for;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num,cont,soma=0;
        System.out.println("Digite um numero e faremos a tabuada desse numero de 1 a 10");
        num = scan.nextInt();
        for (cont=1;cont<=10;cont++){
            soma = cont * num;
            System.out.println(num+"*"+cont+"="+soma);

        }




        scan.close();
    }
}
