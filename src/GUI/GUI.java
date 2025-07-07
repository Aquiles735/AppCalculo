package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  GUI extends JFrame {
    private JPanel Principal;
    private JTextField txtValor1;
    private JButton btbOperacion;
    private JTextField txtResultado;
    private JTextField txtValor2;
    private JButton btbOperacion2;
    private JTextField txtResultado2;
    private JButton btbTotal;
    private JTextField txtTotal;

    public GUI() {
        setTitle("caalculos basicos");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(Principal);

        btbOperacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double numero =Double.parseDouble (txtValor1.getText());
                double resultado = (numero * 10);
                txtValor1.setText("");
                txtResultado.setText(String.valueOf(resultado));

            }
        });

        btbOperacion2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double numero1 =Double.parseDouble (txtValor2.getText());
                double resultado1 = numero1 / 1000;
                txtValor2.setText("");
                txtResultado2.setText(String.valueOf(resultado1));

            }
            //rama
        });
        btbTotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double total=Double.parseDouble (txtResultado.getText());
                double total1=Double.parseDouble (txtResultado2.getText());

                double total3 =total1 * total;
                txtTotal.setText(String.valueOf(total3));
                txtResultado.setText("");
                txtResultado2.setText("");
                //listo

            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }
}
