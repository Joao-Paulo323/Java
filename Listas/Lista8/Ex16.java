package Lista8_for;

public class Ex16 {
    public static void main(String[] args) {
        int cont,a=0,b=1,soma;
        System.out.println("Esses são os 10 primeiro numeros da sequencia de fibonnaci");
        for (cont=0;cont<10;cont++){
            soma=a+b;
            a=b;
            b=soma;
            System.out.println(soma);
        }
    }
}
