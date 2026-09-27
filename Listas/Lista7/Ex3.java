package Lista7_do_while;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        System.out.println("A quantidade de peças produzidas foi  ");
        do {
            total++;
        }while(total<50);
        System.out.println("O total de peças foi de "+total);
   scan.close();
    }
}
