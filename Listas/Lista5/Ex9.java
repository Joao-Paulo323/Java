package Lista5;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0, b = 0;
        while (a <= 50){
            System.out.println(b);
            a = a + 2;
            b = b + a;
        }scan.close();
    }
}
