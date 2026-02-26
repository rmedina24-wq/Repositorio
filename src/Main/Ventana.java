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
		this.setSize(1200,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMaximumSize(new Dimension(1200,800));
		this.setTitle("Mi Ventana");
		//this.setBackground(Color.BLUE); 
		this.setLocation(200,200);
		this.setLayout(null);
		
		Font labelFont = new Font("Arial", Font.BOLD, 16);
		//panel izq 
		
		//contenedor del login 
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.GRAY);
		contenedor.setBounds(0, 0, 600, 600);
		contenedor.setLayout(null);
		
		contenedor.setLocation(0,0);
		this.add(contenedor);

		JLabel title_login = new JLabel();
		title_login.setText("ACCEDER");
		title_login.setBounds(150, 40, 300, 60);
		title_login.setOpaque(true);
		title_login.setBackground(Color.RED);
		title_login.setForeground(Color.WHITE);	
		title_login.setFont(new Font("Arial",Font.BOLD,35));

		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);
		
		JLabel EtNombre = new JLabel("NOMBRE DE USUARIO:");
		EtNombre.setBounds(100, 150, 250, 30);
		EtNombre.setFont(labelFont);
        contenedor.add(EtNombre);
		
		
		JTextField usarname = new JTextField();
		usarname.setBounds(100, 180, 350, 35);
		usarname.setFont(new Font("Arial",Font.BOLD,22));
		contenedor.add(usarname);
		
		JLabel EtContra = new JLabel("CONTRASEÑA:");
		EtContra.setBounds(100, 240, 250, 30);
		EtContra.setFont(labelFont);
        contenedor.add(EtContra);
		
		
		JTextField contraseña = new JTextField();
		contraseña.setBounds(100, 270, 350, 35);
		contraseña.setFont(new Font("Arial",Font.BOLD,22));
		contenedor.add(contraseña);

		JCheckBox recordar = new JCheckBox("Recordarme");
        recordar.setBounds(100, 320, 120, 25);
        recordar.setBackground(Color.GRAY);
        contenedor.add(recordar);

        JLabel olvido = new JLabel("¿Olvidó su contraseña?");
        olvido.setBounds(230, 320, 200, 25);
        contenedor.add(olvido);

		JButton acceder = new JButton();
		acceder.setText("ACCEDER");
		acceder.setLocation(175, 400);
		acceder.setSize(145,50);
		acceder.setFont(new Font("Arial",Font.BOLD,20));
		contenedor.add(acceder);
	
		contenedor.repaint();
		contenedor.revalidate();
		//panel derecho
		JPanel registro = new JPanel();
		registro.setBounds(600, 0, 600, 600);
		registro.setBackground(new Color(137, 245, 220));
		registro.setLayout(null);
		this.add(registro);

		registro.setOpaque(true);
		registro.setBackground(new Color(137,245,220));
		
		JLabel bio_tag = new JLabel("REGISTRO");
		bio_tag.setBounds(150, 40, 300, 60);
		bio_tag.setBackground(Color.BLACK);
		bio_tag.setForeground(Color.WHITE);
		bio_tag.setHorizontalAlignment(JLabel.CENTER);
		bio_tag.setOpaque(true);
		bio_tag.setFont(new Font("Arial",Font.BOLD,22));
		registro.add(bio_tag);
		
		JLabel EtNombreUsuario = new JLabel("NOMBRE DE USUARIO:");
		EtNombreUsuario.setBounds(100, 130, 350, 30);
		EtNombreUsuario.setFont(labelFont);
		EtNombreUsuario.setOpaque(true);
		registro.add(EtNombreUsuario);
		
		JTextField Cajabox = new JTextField();
		Cajabox.setBounds(100, 165, 400, 35);
		Cajabox.setFont(new Font("Arial",Font.BOLD,22));
		registro.add(Cajabox);
		
		JLabel Bio = new JLabel("BIO:");
		Bio.setBounds(250, 210, 100, 30);
		Bio.setFont(labelFont);
		Bio.setOpaque(true);
		registro.add(Bio);
		
		registro.add(bio_tag);
		JTextArea bio = new JTextArea();
		bio.setBounds(100, 250, 400, 80);
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
		
		 JLabel termino = new JLabel("TÉRMINOS");
		 termino.setBounds(200, 375, 200, 30);
		 termino.setOpaque(true);
		 termino.setHorizontalAlignment(JLabel.CENTER);
		 registro.add(termino);
		
		JRadioButton accept_terms = new JRadioButton("acepto los terminos");
		accept_terms.setBounds(120, 415, 150, 50);
		registro.add(accept_terms);
		
		JRadioButton reject_terms = new JRadioButton("rechazo los terminos");
		reject_terms.setBounds(290,415,150,50);
		registro.add(reject_terms);
		
		 ButtonGroup  terms = new ButtonGroup();
		 terms.add(reject_terms);
		 terms.add(accept_terms);
		 
		 String [] colonias = {"camino real","la fuente","la pasion"};
		 JComboBox list = new JComboBox(colonias);
		 list.setBounds(100, 480, 200, 30);
		 registro.add(list);
		 
		 JButton Crear = new JButton();
		 Crear.setText("ACCEDER");
		 Crear.setBounds(150, 520, 300, 40);
		 Crear.setFont(new Font("Arial",Font.BOLD,20));
			registro.add(Crear);
		
		
		
		registro.repaint();
		
	}

}
