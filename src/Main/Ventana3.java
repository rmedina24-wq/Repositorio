package Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ventana3 extends JFrame {

    private JButton[] casillas = new JButton[9];
    private boolean turnoX = true;
    private int movimientos = 0;
    private JLabel lblTurno;

    public Ventana3() {
        setTitle("Juego del Gato");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel superior (turno)
        lblTurno = new JLabel("Turno: X");
        lblTurno.setHorizontalAlignment(SwingConstants.CENTER);
        lblTurno.setFont(new Font("Arial", Font.BOLD, 18));
        add(lblTurno, BorderLayout.NORTH);

        // Tablero
        JPanel tablero = new JPanel();
        tablero.setLayout(new GridLayout(3, 3, 5, 5));
        tablero.setBackground(Color.YELLOW);

        for (int i = 0; i < 9; i++) {
            casillas[i] = new JButton("");
            casillas[i].setFont(new Font("Arial", Font.BOLD, 40));
            casillas[i].setFocusPainted(false);

            final int index = i;

            casillas[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (!casillas[index].getText().equals("")) return;

                    casillas[index].setText(turnoX ? "X" : "O");
                    movimientos++;

                    if (verificarGanador()) {
                        JOptionPane.showMessageDialog(null,
                                "Ganó: " + (turnoX ? "X" : "O"));
                        reiniciar();
                        return;
                    }

                    if (movimientos == 9) {
                        JOptionPane.showMessageDialog(null, "Empate");
                        reiniciar();
                        return;
                    }

                    turnoX = !turnoX;
                    lblTurno.setText("Turno: " + (turnoX ? "X" : "O"));
                }
            });

            tablero.add(casillas[i]);
        }

        add(tablero, BorderLayout.CENTER);

        // Botón reiniciar
        JButton btnReiniciar = new JButton("Reiniciar");
        btnReiniciar.addActionListener(e -> reiniciar());
        add(btnReiniciar, BorderLayout.SOUTH);
    }

    // Verificar ganador
    private boolean verificarGanador() {
        int[][] combinaciones = {
                {0,1,2}, {3,4,5}, {6,7,8},
                {0,3,6}, {1,4,7}, {2,5,8},
                {0,4,8}, {2,4,6}
        };

        for (int[] c : combinaciones) {
            if (!casillas[c[0]].getText().equals("") &&
                casillas[c[0]].getText().equals(casillas[c[1]].getText()) &&
                casillas[c[1]].getText().equals(casillas[c[2]].getText())) {
                return true;
            }
        }
        return false;
    }

    // Reiniciar juego
    private void reiniciar() {
        for (JButton b : casillas) {
            b.setText("");
        }
        turnoX = true;
        movimientos = 0;
        lblTurno.setText("Turno: X");
    }

    public static void main(String[] args) {
        new Ventana3().setVisible(true);
    }
}