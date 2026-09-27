package Lista7_do_while;


public class Ex19 {
    public static void main(String[] args) {
        int rpm = 0;
        do {
            rpm = rpm + 500;
            System.out.println("O rpm atual é de " +rpm);
        }while (rpm<3000);
        System.out.println("RPM máximo de 3000 excedido rpm atual é "+rpm);
    }
}
