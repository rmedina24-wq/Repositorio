package Main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	public Ventana() {
		this.setVisible(true);
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("hola");
		this.setBackground(Color.BLUE); 
		this.setLocation(200,200);

	}

}
