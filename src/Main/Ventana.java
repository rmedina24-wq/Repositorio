package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	public Ventana() {
		this.setVisible(true);
		this.setSize(1200,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setLocationRelativeTo(null);
		this.setMaximumSize(new Dimension(1200,800));
		this.setTitle("hola");
		//this.setBackground(Color.BLUE); 
		this.setLocation(200,200);
		this.setLayout(null);
		
		
		//contenedor del login 
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
		usarname.setLocation(150, 150);
		usarname.setFont(new Font("Arial",Font.BOLD,22));
		contenedor.add(usarname);
		
		JButton acceder = new JButton();
		acceder.setText("ACCEDER");
		acceder.setLocation(175, 400);
		acceder.setSize(145,50);
		acceder.setFont(new Font("Arial",Font.BOLD,22));
		contenedor.add(acceder);
	
		
		contenedor.repaint();
		contenedor.revalidate();
		
		JPanel registro = new JPanel();
		registro.setSize(500,500);
		registro.setLocation(650,5);
		registro.setOpaque(true);
		registro.setLayout(null);
		registro.setBackground(Color.GRAY);
		this.add(registro);
		
		JLabel bio_tag = new JLabel("BIOGRAFIA");
		bio_tag.setBounds(100, 100, 250, 40);
		bio_tag.setBackground(Color.white);
		bio_tag.setHorizontalAlignment(JLabel.CENTER);
		bio_tag.setOpaque(true);
		bio_tag.setFont(new Font("Arial",Font.BOLD,22));
		
		registro.add(bio_tag);
		JTextArea bio = new JTextArea();
		bio.setBounds(120,160,250,120);
		registro.add(bio);
		
		JCheckBox sweet_option = new JCheckBox("Dulce");
		sweet_option.setBounds(120, 330, 100, 50);		
		registro.add(sweet_option);
		
		JCheckBox salty_option = new JCheckBox("Salado");
		salty_option.setBounds(220, 330, 100, 50);
		registro.add(salty_option);
		
		JCheckBox healthy = new JCheckBox("Saludable");
		healthy.setBounds(320, 330, 100, 50);
		healthy.setBorderPainted(true);

		registro.add(healthy);
		
		JRadioButton accept_terms = new JRadioButton("acepto los terminos");
		accept_terms.setBounds(120, 400, 150, 50);
		registro.add(accept_terms);
		
		JRadioButton reject_terms = new JRadioButton("rechazo los terminos");
		reject_terms.setBounds(290,400,150,50);
		registro.add(reject_terms);
		 ButtonGroup  terms = new ButtonGroup();
		 terms.add(reject_terms);
		 terms.add(accept_terms);
		 String [] colonias = {"camino real","la fuente","la pasion"};
		 JComboBox list = new JComboBox(colonias);
		 list.setBounds(50, 50, 200, 60);
		 registro.add(list);
		
		
		
		
		registro.repaint();
		
	}

}
