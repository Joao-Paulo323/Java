package Consumo_energetico;

public class Equipamento {

    String nome;
    int quantidade;
    int potencia;
    double tempo;
    double consumoMensal;
    double custoMensal;

    public Equipamento(String nome, int quantidade, int potencia, double tempo) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.potencia = potencia;
        this.tempo = tempo;
        this.consumoMensal =  (potencia * quantidade * tempo * 30) / 1000;
        this.custoMensal =  consumoMensal * 0.91;
    }
    public void MostrarDados (String ambiente){
            System.out.printf(
                    "Ambiente: %s%n" +
                            "Objeto: %s%n" +
                            "Quantidade: %d%n" +
                            "Potência: %d W%n" +
                            "Tempo: %.2f horas%n" +
                            "Consumo mensal: %.2f kWh%n" +
                            "Custo mensal: R$ %.2f%n%n",
                    ambiente,
                    nome,
                    quantidade,
                    potencia,
                    tempo,
                    consumoMensal,
                    custoMensal
            );



    }
}
