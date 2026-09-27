package Lista8_for;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota;
        int apr = 0, rep = 0, cont;
        System.out.println("Digite a nota de dez alunos ");
        for (cont = 0; cont < 10; cont++) {
            System.out.println("Digite a nota do aluno abaixo");
            nota = scan.nextInt();
            apr = (nota >= 7) ? apr + 1 : apr;
            rep = (nota < 7) ? rep + 1 : rep;
        }
        System.out.println("Teve um total de " + apr + " alunos aprovados e " + rep + " alunos reprovados");

        scan.close();
    }
}
