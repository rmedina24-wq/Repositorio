package Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ventana3 extends JFrame {

    private JButton[] casillas = new JButton[9];
    private boolean turnoX = true;
    private int movimientos = 0;

    private int victoriasX = 0;
    private int victoriasO = 0;

    private JLabel lblTurno;
    private JLabel lblMarcador;

    public Ventana3() {
        setTitle("Juego del Gato");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // PANEL SUPERIOR (Turno + marcador)
        JPanel panelSuperior = new JPanel(new GridLayout(2,1));

        lblTurno = new JLabel("Turno: X");
        lblTurno.setHorizontalAlignment(SwingConstants.CENTER);
        lblTurno.setFont(new Font("Arial", Font.BOLD, 18));

        lblMarcador = new JLabel("X: 0  |  O: 0");
        lblMarcador.setHorizontalAlignment(SwingConstants.CENTER);
        lblMarcador.setFont(new Font("Arial", Font.BOLD, 16));

        panelSuperior.add(lblTurno);
        panelSuperior.add(lblMarcador);

        add(panelSuperior, BorderLayout.NORTH);

        // TABLERO
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

                        if (turnoX) {
                            victoriasX++;
                        } else {
                            victoriasO++;
                        }

                        lblMarcador.setText("X: " + victoriasX + "  |  O: " + victoriasO);

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

        // BOTÓN REINICIAR
        JButton btnReiniciar = new JButton("Reiniciar");
        btnReiniciar.addActionListener(e -> reiniciar());
        add(btnReiniciar, BorderLayout.SOUTH);
    }
    // VERIFICAR GANADOR
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
    // REINICIAR TABLERO
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