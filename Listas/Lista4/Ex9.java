package Lista4_Revisão;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma letra e informaremos se é vogal ou consoante");
        char a = scan.next().charAt(0);
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
            System.out.println("Vogal");
        }
        else{
            System.out.println("Consoante");
    scan.close();}
}
}
