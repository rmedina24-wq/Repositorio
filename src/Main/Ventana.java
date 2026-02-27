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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	public Ventana() {
		
		this.setSize(1200,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMaximumSize(new Dimension(1200,800));
		this.setTitle("Mi Ventana");
		//this.setBackground(Color.BLUE); 
		this.setLocation(200,200);
		this.setLayout(null);
		
		JMenuBar barra = new JMenuBar();
		
		JMenu archivo = new JMenu("archivo");
		JMenuItem open = new JMenuItem("CERRAR");
		JMenuItem close = new JMenuItem("ABRIR");
		JMenuItem save= new JMenuItem("GUARDAR");
		JMenuItem newFile = new JMenuItem("NUEVO");
		archivo.add(open);
		archivo.add(close);
		archivo.add(save);
		archivo.add(newFile);

		
		barra.add(archivo);
		JMenu submenu = new JMenu("otros");
		archivo.addSeparator();

		JMenuItem  menuItem = new JMenuItem ("An item in the submenu");
		submenu.add(menuItem);
		menuItem = new JMenuItem ("Another item");
		submenu.add(menuItem);
		archivo.add(submenu);
		
		this.setJMenuBar(barra);
		this.users();
		this.setVisible(true);

		Font labelFont = new Font("Arial", Font.BOLD, 16);
		//panel izq 
		
		
		
		
	}

	public void login() {
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
		        contenedor.add(EtNombre);
				
				
				JTextField usarname = new JTextField();
				usarname.setBounds(100, 180, 350, 35);
				usarname.setFont(new Font("Arial",Font.BOLD,22));
				contenedor.add(usarname);
				
				JLabel EtContra = new JLabel("CONTRASEÑA:");
				EtContra.setBounds(100, 240, 250, 30);
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
		
	}
	
	public void registro() {
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
				 termino.setBounds(200, 378, 200, 30);
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
				
				
				this.registro();

				registro.repaint();
		
	}
	
	public void users() {
		JPanel users = new JPanel();
		users.setSize(1000,500);
		users.setLocation(100, 50);
		users.setBackground(Color.white);
		users.setLayout(null);
		this.add(users);
		
		JLabel users_little = new JLabel("USUARIOS");
		users_little.setBounds(400, 50, 200, 50);
		users_little.setOpaque(true);
		users_little.setBackground(Color.decode("#F27A61"));
		users_little.setFont(new Font("Arial",Font.BOLD,22));
		users_little.setHorizontalAlignment(JLabel.CENTER);
		users.add(users_little);
		
		JButton export = new JButton("EXPORTAR");
		export.setBounds(30,120,100,40);
		users.add(export);
		
		JButton add = new JButton("AÑADIR");
		add.setBounds(130, 120, 100, 40);
		users.add(add);
		
		String [] table_head = {"No. Control","Nombre","Apellidos","semestre","promedio","acciones"};
		String [][] table_contend= {
				 {"20212425","Juan","Perez","3","8.5","Editar"},
				 {"20212521","Luis","Sala","5","6.5","Editar"},
				 {"20212520","Ana","Castillo","2","5.5","Editar"},
				 {"20212425","Juan","Perez","3","8.5","Editar"},
				 {"20212521","Luis","Sala","5","6.5","Editar"},
				 {"20212520","Ana","Castillo","2","5.5","Editar"},
				 {"20212425","Juan","Perez","3","8.5","Editar"},
				 {"20212521","Luis","Sala","5","6.5","Editar"},
				 {"20212520","Ana","Castillo","2","5.5","Editar"},
				 {"20212425","Pepe","Mesa","2","9.5","Editar"}
		};
		
		JTable users_table = new JTable(table_contend,table_head);
		JScrollPane ScrollPane = new JScrollPane (users_table);
		ScrollPane.setBounds(30, 180, 800, 100);

		
		users.add(ScrollPane);
		
		users.repaint();
		users.revalidate();
	}
	public void calculadora () {
		JPanel panel = new JPanel();
		panel.setOpaque(true);
		panel.setBackground(new Color(64,64,64));
		panel.setBounds(500, 500, 500, 500);
		panel.setLayout(null);
		
		panel.setLocation(200,25);
		this.add(panel);
		
		
		JLabel r1 = new JLabel ();
		r1.setText("198.55");
		r1.setBounds(50, 30, 400, 25);
		r1.setOpaque(true);
		r1.setBackground(Color.WHITE);
		r1.setForeground(Color.BLACK);	
		r1.setFont(new Font("Arial",Font.BOLD,15));
		r1.setHorizontalAlignment(JLabel.CENTER);
		panel.add(r1);
		
		JButton b1 = new JButton();
		b1.setText("CE");
		b1.setBounds(80, 80, 60, 55);
		b1.setOpaque(true);
		b1.setBackground(Color.GRAY);
		b1.setForeground(Color.WHITE);	
		b1.setFont(new Font("Arial",Font.BOLD,10));
		panel.add(b1);
		
		JButton b2 = new JButton();
		b2.setText("");
		b2.setBounds(160, 80, 220, 55);
		b2.setOpaque(true);
		b2.setBackground(Color.GRAY);
		b2.setForeground(Color.WHITE);	
		b2.setFont(new Font("Arial",Font.BOLD,10));
		panel.add(b2);

		JButton b3 = new JButton();
		b3.setText("7");
		b3.setBounds(80, 150, 60, 55);
		b3.setOpaque(true);
		b3.setBackground(Color.GRAY);
		b3.setForeground(Color.WHITE);	
		b3.setFont(new Font("Arial",Font.BOLD,17));
		panel.add(b3);
		
		JButton b4 = new JButton();
		b4.setText("8");
		b4.setBounds(160, 150, 60, 55);
		b4.setOpaque(true);
		b4.setBackground(Color.GRAY);
		b4.setForeground(Color.WHITE);	
		b4.setFont(new Font("Arial",Font.BOLD,17));
		panel.add(b4);
		
		JButton b5 = new JButton();
		b5.setText("9");
		b5.setBounds(240, 150, 60, 55);
		b5.setOpaque(true);
		b5.setBackground(Color.GRAY);
		b5.setForeground(Color.WHITE);	
		b5.setFont(new Font("Arial",Font.BOLD,17));
		panel.add(b5);
		
		JButton b6 = new JButton();
		b6.setText("/");
		b6.setBounds(320, 150, 60, 55);
		b6.setOpaque(true);
		b6.setBackground(new Color(252,148,43));
		b6.setForeground(Color.WHITE);	
		b6.setFont(new Font("Arial",Font.BOLD,17));
		panel.add(b6);
		
		
		JButton b7 = new JButton();
		b7.setText("4");
		b7.setBounds(80, 230, 60, 55);
		b7.setOpaque(true);
		b7.setBackground(Color.GRAY);
		b7.setForeground(Color.WHITE);	
		b7.setFont(new Font("Arial",Font.BOLD,17));
		panel.add(b7);
		
		JButton b8 = new JButton();
		b8.setText("5");
		b8.setBounds(160, 230, 60, 55);
		b8.setOpaque(true);
		b8.setBackground(Color.GRAY);
		b8.setForeground(Color.WHITE);	
		b8.setFont(new Font("Arial",Font.BOLD,17));
		panel.add(b8);
		
		JButton b9 = new JButton();
		b9.setText("6");
		b9.setBounds(240, 230, 60, 55);
		b9.setOpaque(true);
		b9.setBackground(Color.GRAY);
		b9.setForeground(Color.WHITE);	
		b9.setFont(new Font("Arial",Font.BOLD,17));
		panel.add(b9);
		
		JButton b10 = new JButton();
		b10.setText("X");
		b10.setBounds(320, 230, 60, 55);
		b10.setOpaque(true);
		b10.setBackground(new Color(252,148,43));
		b10.setForeground(Color.WHITE);	
		b10.setFont(new Font("Arial",Font.BOLD,17));
		panel.add(b10);
		
		JButton c4 = new JButton();
		c4.setText("1");
		c4.setBounds(80, 310, 60, 55);
		c4.setOpaque(true);
		c4.setBackground(Color.GRAY);
		c4.setForeground(Color.WHITE);	
		c4.setFont(new Font("Arial",Font.BOLD,17));
		panel.add(c4);
		
		JButton c3 = new JButton();
		c3.setText("2");
		c3.setBounds(160, 310, 60, 55);
		c3.setOpaque(true);
		c3.setBackground(Color.GRAY);
		c3.setForeground(Color.WHITE);	
		c3.setFont(new Font("Arial",Font.BOLD,17));
		panel.add(c3);
		
		JButton c2 = new JButton();
		c2.setText("3");
		c2.setBounds(240, 310, 60, 55);
		c2.setOpaque(true);
		c2.setBackground(Color.GRAY);
		c2.setForeground(Color.WHITE);	
		c2.setFont(new Font("Arial",Font.BOLD,17));
		panel.add(c2);
		
		JButton c1 = new JButton();
		c1.setText("-");
		c1.setBounds(320, 310, 60, 55);
		c1.setOpaque(true);
		c1.setBackground(new Color(252,148,43));
		c1.setForeground(Color.WHITE);	
		c1.setFont(new Font("Arial",Font.BOLD,17));
		panel.add(c1);
		
		//-----------------------------------------
		JButton p1 = new JButton();
		p1.setText("0");
		p1.setBounds(80, 390, 60, 55);
		p1.setOpaque(true);
		p1.setBackground(Color.GRAY);
		p1.setForeground(Color.WHITE);	
		p1.setFont(new Font("Arial",Font.BOLD,17));
		panel.add(p1);
		
		JButton p2 = new JButton();
		p2.setText(".");
		p2.setBounds(160, 390, 60, 55);
		p2.setOpaque(true);
		p2.setBackground(Color.GRAY);
		p2.setForeground(Color.WHITE);	
		p2.setFont(new Font("Arial",Font.BOLD,17));
		panel.add(p2);
		
		JButton p5 = new JButton();
		p5.setText("=");
		p5.setBounds(240, 390, 60, 55);
		p5.setOpaque(true);
		p5.setBackground(new Color(252,148,43));		
		p5.setForeground(Color.WHITE);	
		p5.setFont(new Font("Arial",Font.BOLD,17));
		panel.add(p5);
		
		JButton p6 = new JButton();
		p6.setText("+");
		p6.setBounds(320, 390, 60, 55);
		p6.setOpaque(true);
		p6.setBackground(new Color(252,148,43));
		p6.setForeground(Color.WHITE);	
		p6.setFont(new Font("Arial",Font.BOLD,17));
		panel.add(p6);
		
		
		
		
		panel.repaint();
		panel.revalidate();
		
	}
}
