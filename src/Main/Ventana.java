package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	public Ventana() {
		this.setVisible(true);
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setLocationRelativeTo(null);
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("hola");
		//this.setBackground(Color.BLUE); 
		this.setLocation(200,200);
		this.setLayout(null);
		
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.BLACK);
		contenedor.setLocation(50, 50);
		contenedor.setSize(500,500);
		contenedor.setLayout(null);
		
		contenedor.setLocation(0,0);
		this.add(contenedor);

		JLabel title_login = new JLabel();
		title_login.setText("bienvenido");
		title_login.setSize(200,30);
		title_login.setOpaque(true);
		title_login.setLocation(150,20);
		title_login.setOpaque(true);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		title_login.setBackground(Color.white);
		contenedor.add(title_login);
		
		
		
		JTextField usarname = new JTextField();
		usarname.setSize(200,30);
		usarname.setLocation(30, 150);
		usarname.setFont(new Font("Arial",Font.BOLD,22));
		contenedor.add(usarname);
		
		contenedor.repaint();
		contenedor.revalidate();
	}

}
