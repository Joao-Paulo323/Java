package Lista7_do_while;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String condicao;
       double bom=0,ruim=0,loop=0,pct;
        do {
            System.out.println("Digite a condição da proxima peça, (ok) para peças boas ou (def) para peças com defeito");
            condicao = scan.next();
            while (!condicao.equals("ok") & !condicao.equals("def")){
                System.out.println("Digite uma opção valida");
                condicao = scan.next();
            }
            ruim =(condicao . equals("def"))?ruim + 1:ruim;
            bom = (condicao.equals("ok"))?bom + 1:bom;
            loop++;
        }while (loop<15);
        System.out.println(loop);
        pct =(ruim /loop) *100;
        System.out.println("O total de peças boas foi de "+bom+" e o total de peças com defeitos foi "+ruim);
        System.out.printf("Teve um total de %.2f%%%n de perda",pct);
        scan.close();
    }
}
