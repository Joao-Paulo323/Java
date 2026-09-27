package Consumo_energetico;



import java.util.ArrayList;

public class Cantina {

    ArrayList<Equipamento> equipamentos = new ArrayList<>();


    public Cantina() {
        equipamentos.add(
                new Equipamento ("Fita LED",6,12,16)
        );
        equipamentos.add (
                new Equipamento ("Micro-Ondas Philco",1,1400,2)
        );
        equipamentos.add(
        new Equipamento("Micro-Ondas Mondial", 1,1400,2)
        );
        equipamentos.add(
                new Equipamento ("Micro-Ondas Whirpol", 1,900,2)
        );
        equipamentos.add (
                new Equipamento ("Ar-condicionado BTUs",2,3100,15)
        );
        equipamentos.add(
                new Equipamento ("Resfriador",1,317,24)
        );
        equipamentos.add (
                new Equipamento ("Led Spot Redondo",4,5,16)
        );
        equipamentos.add (
                new Equipamento ("Geladeira Consul 1",1,320,24)
        );
                equipamentos.add (
                             new Equipamento ("Geladeira Consul 2",1,95,24)
                );

            equipamentos.add (
                    new Equipamento ("Acess point",1,9,24)
                    );
    }

    public void adicionarEquipamento(Equipamento equipamento){
        equipamentos.add(equipamento);
    }
    public void mostrarEquipamentos(){

        System.out.println("==========CANTINA==========");

        for (Equipamento equipamentos : equipamentos) {
            equipamentos.MostrarDados("Cantina");
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

