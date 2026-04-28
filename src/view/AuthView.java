package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controllers.AuthController;

public class AuthView {
	public AuthView() {
		loginView();
		
	}

	public void loginView() {
		 JFrame ventana = new JFrame();

		    ventana.setSize(1200, 600);
		    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    ventana.setMinimumSize(new Dimension(200,200));
		    ventana.setMaximumSize(new Dimension(800,800));
		    ventana.setTitle("Login");
		    ventana.setBackground(Color.BLACK);
		    ventana.setLocation(100,100);
		    ventana.setLayout(null);
		    

		    // Label título
		    JLabel title_login = new JLabel();
		    title_login.setText("Bienvenido");
		    title_login.setSize(200, 30);
		    title_login.setOpaque(true);
		    title_login.setLocation(150, 10);
		    title_login.setBackground(Color.white);
		    title_login.setFont(new Font("Arial",Font.BOLD,22));
		    title_login.setHorizontalAlignment(JLabel.CENTER);
		    ventana.add(title_login);

		    // Usuario
		    JLabel user_tag = new JLabel("Correo Electronico");
		    user_tag.setBounds(40, 120, 300, 30);
		    user_tag.setFont(new Font("Arial",Font.BOLD,17));
		    ventana.add(user_tag);

		    JTextField username = new JTextField();
		    username.setSize(300, 30);
		    username.setLocation(30,150);
		    username.setFont(new Font("Arial",Font.BOLD,22));
		    ventana.add(username);

		    // Contraseña
		    JLabel user_pass = new JLabel("Contraseña");
		    user_pass.setBounds(40, 180, 300, 30);
		    user_pass.setFont(new Font("Arial",Font.BOLD,17));
		    ventana.add(user_pass);

		    JTextField userpass = new JTextField();
		    userpass.setSize(300, 30);
		    userpass.setLocation(30,210);
		    userpass.setFont(new Font("Arial",Font.BOLD,22));
		    ventana.add(userpass);

		    // Botón acceder (por ahora solo prueba)
		    JButton acceder = new JButton();
		    acceder.setText("Acceder");
		    acceder.setLocation(200, 400);
		    acceder.setSize(180, 50);
		    acceder.setFont(new Font("Arial",Font.BOLD,22));
		    ventana.add(acceder);

		    acceder.addActionListener(e -> {
		        System.out.println("Aquí validarías el login");
		    });

		    JButton registro = new JButton("¿Aun no tienes cuenta?");
		    registro.setLocation(150, 460);
		    registro.setSize(300, 50);
		    registro.setFont(new Font("Arial",Font.BOLD,18));
		    ventana.add(registro);

		    registro.addActionListener(e -> {
		        ventana.dispose(); // cerrar login
		        registerView();
		    });

		    ventana.repaint();
		    ventana.add(Contenedor);
		    ventana.setVisible(true);
	}
	public void registerView() {
		JPanel registro = new JPanel();
		registro.setBounds(600, 0, 600, 600);
		registro.setBackground(new Color(137, 245, 220));
		registro.setLayout(null);
		//this.add(registro);

		registro.setOpaque(true);
		registro.setBackground(new Color(137,245,220));
		
		JLabel bio_tag = new JLabel("REGISTRO");
		bio_tag.setBounds(150, 40, 300, 60);
		bio_tag.setBackground(Color.BLACK);
		bio_tag.setForeground(Color.WHITE);
		bio_tag.setHorizontalAlignment(JLabel.CENTER);
		bio_tag.setOpaque(false);
		bio_tag.setFont(new Font("Arial",Font.BOLD,22));
		registro.add(bio_tag);
		
		JLabel EtNombreUsuario = new JLabel("NOMBRE DE USUARIO:");
		EtNombreUsuario.setBounds(100, 130, 350, 30);
		EtNombreUsuario.setOpaque(false);
		registro.add(EtNombreUsuario);
		
		JTextField Cajabox = new JTextField();
		Cajabox.setBounds(100, 165, 400, 35);
		Cajabox.setFont(new Font("Arial",Font.BOLD,22));
		registro.add(Cajabox);
		
		JLabel Bio = new JLabel("BIO:");
		Bio.setBounds(250, 210, 100, 30);
		Bio.setOpaque(false);
		registro.add(Bio);
		
		registro.add(bio_tag);
		JTextArea bio = new JTextArea();
		bio.setBounds(100, 250, 400, 60);
		registro.add(bio);
		
		JCheckBox sweet_option = new JCheckBox("Dulce");
		sweet_option.setBounds(120, 330, 100, 40);		
		registro.add(sweet_option);
		
		JCheckBox salty_option = new JCheckBox("Salado");
		salty_option.setBounds(220, 330, 100, 40);
		registro.add(salty_option);
		
		JCheckBox healthy = new JCheckBox("Saludable");
		healthy.setBounds(320, 330, 100, 40);
		healthy.setBorderPainted(true);

		registro.add(healthy);
		
		 JLabel termino = new JLabel("TÉRMINOS");
		 termino.setBounds(200, 378, 200, 25);
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
		
			Crear.addActionListener(new ActionListener() {
			    @Override
			    public void actionPerformed(ActionEvent e) {

			        // Cerrar ventana actual (registro)
			        JFrame ventanaActual = (JFrame) registro.getTopLevelAncestor();
			        ventanaActual.dispose();

			        // Abrir login
			        loginView();
			    }
			});

		registro.repaint();
		registro.setVisible(true);

		
	}
	
}
