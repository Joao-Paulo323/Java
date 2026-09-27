package Lista9;


import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=5,b;
        int [] vector = new int[a];
        System.out.println("Digite 5 numeros abaixo");
        for (b=0;b<a;b++){
          vector [b] = scan.nextInt();
        }
        System.out.println("Seus numeros são: "+Arrays.toString(vector));
        scan.close();
    }
}