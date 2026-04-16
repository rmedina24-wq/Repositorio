package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Button;

public class Ventana3 extends JFrame {

	private JFrame frame;
	private JButton[] casillas = new JButton[9];
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana3 frame = new Ventana3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana3() {
		initialize();

	}
	private void initialize() {
		
		frame =  new JFrame( "Tic Tac");
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		Button button_3 = new Button("New button");
		panel.add(button_3);
		
		Button button_6 = new Button("New button");
		panel.add(button_6);
		
		Button button_1 = new Button("New button");
		panel.add(button_1);
		
		Button button_4 = new Button("New button");
		panel.add(button_4);
		
		Button button_2 = new Button("New button");
		panel.add(button_2);
		
		Button button = new Button("New button");
		panel.add(button);
		
		Button button_5 = new Button("New button");
		panel.add(button_5);
		
		Button button_7 = new Button("New button");
		panel.add(button_7);
		
		Button button_8 = new Button("New button");
		panel.add(button_8);

        for (int i = 0; i < 9; i++) {
            casillas[i] = new JButton("");
            casillas[i].setFont(new Font("Arial", Font.BOLD, 36));
            Container panelTablero = null;
			panelTablero.add(casillas[i]);
        }
	}
	

}
