package Consumo_energetico;


import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Equipamento> equipamentos = new ArrayList<>();


    public Biblioteca() {

        equipamentos.add(
        new Equipamento ("Fita LED",12,12,15)
        );
        equipamentos.add (
        new Equipamento ("computador",4,240,9)
        );
        equipamentos.add (
                new Equipamento ("Ar-condicionado BTUs",3,3100,15)
        );
        equipamentos.add(
         new Equipamento ("Impressora 3D (Bambu A1)",1,120,3)
        );
        equipamentos.add (
        new Equipamento ("Televisão",2,1210,2)
        );
        equipamentos.add (
                new Equipamento("Impressora 3D (Maker bot)",1,100,2 )
        );
        equipamentos.add(
                new Equipamento("Monitor Itautec",2,30,9)
        );
        equipamentos.add(
                new Equipamento("Monitor LG 1",1,220,9)
        );
        equipamentos.add(
                new Equipamento("Monitor LG 2",1,176,9)
        );
        equipamentos.add(
                new Equipamento("Acess Point",1,9,24)
        );

    }
    public void adicionarEquipamento(Equipamento equipamento){
        equipamentos.add(equipamento);
    }
    public void mostrarEquipamentos(){

        System.out.println("==========Biblioteca==========");

        for (Equipamento equipamentos : equipamentos) {
            equipamentos.MostrarDados("Biblioteca");
        }
    }

        public double calcularConsumoTotal() {

            double total = 0;

            for (Equipamento equipamento : equipamentos) {
                total += equipamento.consumoMensal;
            }

            return total;
        }

        public double calcularCustoTotal() {

            double total = 0;

            for (Equipamento equipamento : equipamentos) {
                total += equipamento.custoMensal;
            }

            return total;
        }

}

