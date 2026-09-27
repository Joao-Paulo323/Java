package Calculadora;

import javax.swing.*;
import java.awt.*;

public class Calculadora1 extends JFrame {

    private JComboBox<String> comboCalculo;
    private JTextField campo1;
    private JTextField campo2;
    private JLabel label1;
    private JLabel label2;
    private JLabel resultado;

    public Calculadora1() {

        // Configurações da janela
        setTitle("Calculadora de Grandezas Elétricas");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel principal
        JPanel painel = new JPanel();
        painel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Título
        JLabel titulo = new JLabel("CALCULADORA DE GRANDEZAS ELÉTRICAS");
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        painel.add(titulo, gbc);

        // Seleção do cálculo
        JLabel labelCalculo = new JLabel("Escolha o cálculo:");

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        painel.add(labelCalculo, gbc);

        comboCalculo = new JComboBox<>(new String[]{
                "V = R × I  - Tensão",
                "I = V ÷ R  - Corrente",
                "R = V ÷ I  - Resistência",
                "P = V × I  - Potência"
        });

        gbc.gridx = 1;
        gbc.gridy = 1;
        painel.add(comboCalculo, gbc);

        // Campo 1
        label1 = new JLabel("Resistência (Ω):");

        gbc.gridx = 0;
        gbc.gridy = 2;
        painel.add(label1, gbc);

        campo1 = new JTextField();

        gbc.gridx = 1;
        gbc.gridy = 2;
        painel.add(campo1, gbc);

        // Campo 2
        label2 = new JLabel("Corrente (A):");

        gbc.gridx = 0;
        gbc.gridy = 3;
        painel.add(label2, gbc);

        campo2 = new JTextField();

        gbc.gridx = 1;
        gbc.gridy = 3;
        painel.add(campo2, gbc);

        // Botão calcular
        JButton botaoCalcular = new JButton("CALCULAR");

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        painel.add(botaoCalcular, gbc);

        // Resultado
        resultado = new JLabel("Resultado: ");
        resultado.setFont(new Font("Arial", Font.BOLD, 18));
        resultado.setHorizontalAlignment(SwingConstants.CENTER);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        painel.add(resultado, gbc);

        // Botão limpar
        JButton botaoLimpar = new JButton("LIMPAR");

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        painel.add(botaoLimpar, gbc);

        // Botão sair
        JButton botaoSair = new JButton("SAIR");

        gbc.gridx = 1;
        gbc.gridy = 6;
        painel.add(botaoSair, gbc);

        // Atualiza os nomes dos campos quando muda o cálculo
        comboCalculo.addActionListener(e -> atualizarCampos());

        // Botão calcular
        botaoCalcular.addActionListener(e -> calcular());

        // Botão limpar
        botaoLimpar.addActionListener(e -> {
            campo1.setText("");
            campo2.setText("");
            resultado.setText("Resultado: ");
        });

        // Botão sair
        botaoSair.addActionListener(e -> {
            System.exit(0);
        });

        add(painel);

        atualizarCampos();
    }

    private void atualizarCampos() {

        int opcao = comboCalculo.getSelectedIndex();

        if (opcao == 0) {
            // V = R × I
            label1.setText("Resistência (Ω):");
            label2.setText("Corrente (A):");
        }

        else if (opcao == 1) {
            // I = V ÷ R
            label1.setText("Tensão (V):");
            label2.setText("Resistência (Ω):");
        }

        else if (opcao == 2) {
            // R = V ÷ I
            label1.setText("Tensão (V):");
            label2.setText("Corrente (A):");
        }

        else if (opcao == 3) {
            // P = V × I
            label1.setText("Tensão (V):");
            label2.setText("Corrente (A):");
        }
    }

    private void calcular() {

        try {

            double valor1 = Double.parseDouble(campo1.getText());
            double valor2 = Double.parseDouble(campo2.getText());

            double resultadoCalculo;
            String unidade;

            int opcao = comboCalculo.getSelectedIndex();

            if (opcao == 0) {

                // V = R × I
                resultadoCalculo = valor1 * valor2;
                unidade = "V";

            } else if (opcao == 1) {

                // I = V ÷ R
                if (valor2 == 0) {
                    JOptionPane.showMessageDialog(
                            this,
                            "A resistência não pode ser zero!"
                    );
                    return;
                }

                resultadoCalculo = valor1 / valor2;
                unidade = "A";

            } else if (opcao == 2) {

                // R = V ÷ I
                if (valor2 == 0) {
                    JOptionPane.showMessageDialog(
                            this,
                            "A corrente não pode ser zero!"
                    );
                    return;
                }

                resultadoCalculo = valor1 / valor2;
                unidade = "Ω";

            } else {

                // P = V × I
                resultadoCalculo = valor1 * valor2;
                unidade = "W";
            }

            resultado.setText(
                    String.format("Resultado: %.2f %s",
                            resultadoCalculo,
                            unidade)
            );

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Digite apenas números válidos!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            Calculadora1 janela = new Calculadora1();

            janela.setVisible(true);
        });
    }
}