package Consumo_energetico;

import java.util.Scanner;

public class PROJETO {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int opc;


        Biblioteca biblioteca = new Biblioteca();
        Cantina cantina = new Cantina();

        System.out.println(
                "Bem vindo ao programa de calculos de consumo de áreas comuns"
                        + "\n\nO que você deseja hoje?"
                        + "\n1 - Cadastrar e calcular o gasto mensal de um novo objeto"
                        + "\n2 - Calcular o consumo de uma área comum"
                        + "\n3 - Atualizar os objetos presentes em uma área comum"
        );

        opc = scan.nextInt();
        scan.nextLine();
 

        if (opc == 1) {

            String retorno = "sim";
            String ambiente;
            while (retorno.equalsIgnoreCase("sim")) {



                System.out.println(
                        "\nEscreva em qual ambiente ele irá entrar"
                                + " (biblioteca/cantina)"
                );

                ambiente = scan.nextLine();

                while (!ambiente.equalsIgnoreCase("biblioteca")
                        && !ambiente.equalsIgnoreCase("cantina")) {

                    System.out.println(
                            "Opção inválida. Escolha entre "
                                    + "(cantina ou biblioteca)"
                    );

                    ambiente = scan.nextLine();
                }

          

                System.out.println("Escreva o nome do objeto");
                String nome = scan.nextLine();

                System.out.println("Escreva a quantidade de objetos");
                int quantidade = scan.nextInt();

                System.out.println("Escreva a potência");
                int potencia = scan.nextInt();

                System.out.println(
                        "Escreva o tempo médio de uso em horas diário"
                );

                double tempo = scan.nextDouble();

                while (tempo > 24 || tempo < 0) {

                    System.out.println(
                            "Tempo de uso inválido. "
                                    + "Coloque um valor entre 0 e 24"
                    );

                    tempo = scan.nextDouble();
                }

                scan.nextLine();


                Equipamento novoEquipamento =
                        new Equipamento(
                                nome,
                                quantidade,
                                potencia,
                                tempo
                        );
         

                if (ambiente.equalsIgnoreCase("biblioteca")) {

                    biblioteca.adicionarEquipamento(novoEquipamento);

                    System.out.println(
                            "Equipamento adicionado à biblioteca!"
                    );

                } else {

                    cantina.adicionarEquipamento(novoEquipamento);

                    System.out.println(
                            "Equipamento adicionado à cantina!"
                    );
                }


                System.out.println(
                        "\nVocê deseja adicionar outro objeto? (sim/nao)"
                );

                retorno = scan.nextLine();
                if (retorno.equalsIgnoreCase("nao")){
                  if (ambiente.equalsIgnoreCase("biblioteca")){
                   //   System.out.println(nome+", "+quantidade+", "+potencia+", "+tempo);
                      biblioteca.mostrarEquipamentos();
                      }
                    else {
                      cantina.mostrarEquipamentos();
                  }
                }
                while (!retorno.equalsIgnoreCase("sim")
                        && !retorno.equalsIgnoreCase("nao")) {

                    System.out.println(
                            "Digite uma opção válida (sim ou nao)"
                    );
                    retorno = scan.nextLine();

                }
            }
        }
        else if (opc == 2)  {

            System.out.println(
                    "\nQual área você deseja consultar?"
                            + "\n1 - Biblioteca"
                            + "\n2 - Cantina"
            );

            int area = scan.nextInt();

            if (area == 1) {

                double consumo = biblioteca.calcularConsumoTotal();
                double custo = biblioteca.calcularCustoTotal();

                System.out.printf(
                        "\n===== CONSUMO DA BIBLIOTECA =====%n" +
                                "Consumo mensal: %.2f kWh%n" +
                                "Custo mensal: R$ %.2f%n",
                        consumo,
                        custo
                );
            } else if (area == 2) {

                double consumo = cantina.calcularConsumoTotal();
                double custo = cantina.calcularCustoTotal();

                System.out.printf(
                        "\n===== CONSUMO DA CANTINA =====%n" +
                                "Consumo mensal: %.2f kWh%n" +
                                "Custo mensal: R$ %.2f%n",
                        consumo,
                        custo
                );

            } else {

                System.out.println("Área inválida.");
            }
        }


      
        else if (opc == 3) {

            System.out.println(
                    "\nEquipamentos atuais da biblioteca:"
            );

            biblioteca.mostrarEquipamentos();

            System.out.println(
                    "\nEquipamentos atuais da cantina:"
            );

            cantina.mostrarEquipamentos();
        }

        else {

            System.out.println(
                    "Essa opção ainda não foi implementada."
            );
        }




        scan.close();
    }
}
