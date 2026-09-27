package Calculadora;

import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("================================================\n" +
                           "Bem vindo a calculadora de calculos de grandezas\n" +
                           "================================================");
        Boolean sist = true;
        while(sist) {
            System.out.println("Digite qual opção voce deseja efetuar \n" +
                    "1. V = R × I  Calcula a tensão eletrica \n" +
                    "2. I = V ÷ R  Calcula a corrente elétrica\n" +
                    "3. R = V ÷ I  Calcula a resistência elétrica\n" +
                    "4. P = V × I  Calcula a potência elétrica\n" +
                    "5. Sair do progama");
            int opcao = new Scanner(System.in).nextInt();
            while (opcao < 1 || opcao > 5) {
                System.out.println("Opção invalida por favor digite uma opção valida ");
                opcao = new Scanner(System.in).nextInt();
            }
            if (opcao == 1) {
                System.out.println("Digite o valor da Resistencia ");
                double resistencia = new Scanner(System.in).nextDouble();
                System.out.println("Digite o valor da Corrente ");
                double corrente = new Scanner(System.in).nextDouble();
                double tensao = resistencia * corrente;
                System.out.println("O valor da tensão e de "+tensao+"V");
                Thread.sleep(1000);
            }
            if (opcao == 2) {
                System.out.println("Digite o valor da Tensão ");
                double tensao = new Scanner(System.in).nextDouble();
                System.out.println("Digite o valor da Resistencia ");
                double resistencia = new Scanner(System.in).nextDouble();
                double corrente = resistencia / tensao;
                System.out.println("O valor da Corrente eletrica e de "+corrente+"A");
                Thread.sleep(1000);
            }
            if (opcao == 3) {
                System.out.println("Digite o valor da Tensão");
                double tensao = new Scanner(System.in).nextDouble();
                System.out.println("Digite o valor da Corrente");
                double corrente = new Scanner(System.in).nextDouble();
                double resistencia = corrente / tensao;
                System.out.println("O valor da resistencia e de "+resistencia+"Ω");
                Thread.sleep(1000);}

            if (opcao == 4) {
                System.out.println("Digite o valor da Tensão ");
                double tensao = new Scanner(System.in).nextDouble();
                System.out.println("Digite o valor da Corrente");
                double corrente = new Scanner(System.in).nextDouble();
                double potencia = corrente / tensao;
                System.out.println("O valor da potencia eletrica e de "+potencia+"W");
                Thread.sleep(1000);
            }

            if (opcao == 5) {
                sist = false;
                System.out.println("Obrigado por usar o programa!");
            }

        }
    }
}
