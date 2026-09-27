package Lista3_com_condicional_ternaria;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println("Digite sua idade abaixo");
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        String fx;
        fx =(id <=12 && id > 0) ? "Faixa etaria infantil" : (id <=17 && id >0)
                                ? "Faixa etaria adolescente" :(id<=64 && id >0)
                                ?"Faixa etaria adulto":(id<=130 && id>0)
                                ?"Faixa etaria idoso":"Idade invalida";
        System.out.println(fx);

        }
    }

