package Lista7_do_while;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantos % o tanque de combustivel ira receber ");
        int oleo = scan.nextInt();
        int tanque=0;
        do {
            tanque = tanque + oleo;
            if(tanque <80){
                System.out.println("Enchendo, o tanque total do tanque atualmente é "+tanque+"%");
                System.out.println("Digite quantos % sera a proxima carga");
                oleo = scan.nextInt();
            }
        }while(tanque <80);
        System.out.println("Tanque cheio ");
    }
}
