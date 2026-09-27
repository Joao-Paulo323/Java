package Lista9;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,i;
        ArrayList<Integer> OptimusPrime = new ArrayList<Integer>(); {
            System.out.println("Digite 5 numeros abaixo");
            for (i = 0; i <5; i++) {
               a = scan.nextInt();
                 OptimusPrime.add(a);
            }
              System.out.println(OptimusPrime);
        }

          scan.close();
    }
}
