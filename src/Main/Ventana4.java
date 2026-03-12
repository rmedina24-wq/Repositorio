package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtJuanCarlos;
	private JTextField txtArrolla;
	private JTextField txtDiaz;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana4 frame = new Ventana4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	 */
	

	/**
	 * Create the frame.
	 */
	public Ventana4() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 255, 255));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("	Nombres:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setBounds(20, 22, 66, 20);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\tApellido Paterno:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1_1.setBounds(10, 45, 96, 20);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\tApellido Materno:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1_1_1.setBounds(10, 67, 96, 20);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("\tFecha de Nacimiento:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1_1_1_1.setBounds(10, 88, 106, 20);
		panel_2.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Sexo:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1_2.setBounds(50, 109, 66, 20);
		panel_2.add(lblNewLabel_1_2);
		
		txtJuanCarlos = new JTextField();
		txtJuanCarlos.setText("Juan Carlos");
		txtJuanCarlos.setBounds(76, 25, 80, 14);
		panel_2.add(txtJuanCarlos);
		txtJuanCarlos.setColumns(10);
		
		txtArrolla = new JTextField();
		txtArrolla.setText("Arrolla");
		txtArrolla.setColumns(10);
		txtArrolla.setBounds(102, 48, 80, 14);
		panel_2.add(txtArrolla);
		
		txtDiaz = new JTextField();
		txtDiaz.setText("Diaz");
		txtDiaz.setColumns(10);
		txtDiaz.setBounds(102, 70, 80, 14);
		panel_2.add(txtDiaz);
		
		textField = new JTextField();
		textField.setText("07/01/1990");
		textField.setColumns(10);
		textField.setBounds(122, 94, 80, 14);
		panel_2.add(textField);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBackground(new Color(0, 255, 255));
		rdbtnNewRadioButton.setBounds(93, 115, 80, 14);
		panel_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setBackground(new Color(0, 255, 255));
		rdbtnFemenino.setForeground(new Color(0, 0, 0));
		rdbtnFemenino.setBounds(93, 137, 80, 14);
		panel_2.add(rdbtnFemenino);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Nacionalidad");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1_1_1_1_1.setBounds(26, 158, 80, 20);
		panel_2.add(lblNewLabel_1_1_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Peru", "Mexico"}));
		comboBox.setToolTipText("Peru");
		comboBox.setBounds(102, 158, 96, 20);
		panel_2.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Datos Generales");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(0, 0, 106, 14);
		panel_2.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 192, 203));
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblPerfilDelUsuario = new JLabel("Perfil del Usuario");
		lblPerfilDelUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPerfilDelUsuario.setBounds(10, 0, 116, 14);
		panel_4.add(lblPerfilDelUsuario);
		
		JLabel lblNewLabel_2 = new JLabel("Imagen");
		lblNewLabel_2.setEnabled(false);
		lblNewLabel_2.setBackground(new Color(250, 128, 114));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(69, 35, 95, 69);
		panel_4.add(lblNewLabel_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar foto de perfil");
		chckbxNewCheckBox.setBackground(new Color(255, 192, 203));
		chckbxNewCheckBox.setBounds(55, 111, 151, 23);
		panel_4.add(chckbxNewCheckBox);
		
		JCheckBox chckbxMostrarFechaDe = new JCheckBox("Mostrar fecha de nacimiento");
		chckbxMostrarFechaDe.setBackground(new Color(255, 192, 203));
		chckbxMostrarFechaDe.setBounds(37, 144, 169, 23);
		panel_4.add(chckbxMostrarFechaDe);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(250, 128, 114));
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblDatosOpcionales = new JLabel("Datos opcionales");
		lblDatosOpcionales.setBounds(0, 0, 130, 16);
		lblDatosOpcionales.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_3.add(lblDatosOpcionales);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Descripcion ");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_1_1_1.setBounds(22, 27, 80, 20);
		panel_3.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Preferencias ");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(131, 30, 80, 20);
		panel_3.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 66, 96, 105);
		panel_3.add(scrollPane);
		
		JSeparator separator_1 = new JSeparator();
		scrollPane.setColumnHeaderView(separator_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setEnabled(false);
		scrollPane.setRowHeaderView(scrollBar);
		
		JTextArea txtrHolaAmigosDel = new JTextArea();
		scrollPane.setViewportView(txtrHolaAmigosDel);
		txtrHolaAmigosDel.setWrapStyleWord(true);
		txtrHolaAmigosDel.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtrHolaAmigosDel.setText("Hola amigos del yutu gracias por compartir ");
		txtrHolaAmigosDel.setLineWrap(true);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(141, 61, 74, 110);
		panel_3.add(scrollPane_1);
		
		JList list = new JList();
		list.setLayoutOrientation(JList.VERTICAL_WRAP);
		list.setFont(new Font("Tahoma", Font.PLAIN, 10));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Cantar", "Escuchar Musica ", "Leer", "Deportes"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane_1.setViewportView(list);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 255));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBackground(new Color(0, 0, 0));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setBounds(74, 84, 89, 23);
		panel_1.add(btnGuardar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBackground(new Color(0, 0, 0));
		btnSalir.setBounds(74, 132, 89, 23);
		panel_1.add(btnSalir);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(74, 38, 89, 23);
		panel_1.add(btnNewButton);

	}
	public void marco() {
		
	}
	
}
