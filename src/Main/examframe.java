package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;

public class examframe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtCalle;
	private JTextField txtJhonPerez;
	private JTextField textField_3;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTextField textField_4;
	/**
	 * @wbp.nonvisual location=51,18
	 */
	private final JLabel lblFacturaEnJava = new JLabel("Factura en Java Swing ");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					examframe frame = new examframe();
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
	public examframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos del cliente", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 414, 77);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(2, 4, 2, 5));
		
		JLabel lblNewLabel_2 = new JLabel("Documento:");
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setText("11233264");
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombres:");
		panel.add(lblNewLabel_1);
		
		txtJhonPerez = new JTextField();
		txtJhonPerez.setText("Jhon Perez");
		panel.add(txtJhonPerez);
		txtJhonPerez.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Direccion:");
		panel.add(lblNewLabel);
		
		txtCalle = new JTextField();
		txtCalle.setText("CALLE 1 #12");
		panel.add(txtCalle);
		txtCalle.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Telefono:");
		panel.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setText("44616");
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Datos de Factura", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 99, 414, 49);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 4, 20, 2));
		
		JLabel lblNewLabel_4 = new JLabel("N° De Factura:");
		panel_1.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setText("1");
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha:");
		panel_1.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setText("22/10/2003");
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 147, 414, 34);
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Ver Listas de Factura");
		panel_2.add(btnNewButton, BorderLayout.WEST);
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		JButton btnNewButton_2 = new JButton("Añadir");
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		panel_3.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 192, 414, 77);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Producto", "Cantidad", "Valor", "Sub Total"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_6 = new JLabel("Sub Total : ");
		lblNewLabel_6.setBounds(20, 280, 64, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("IVA 19% :");
		lblNewLabel_6_1.setBounds(20, 339, 64, 14);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("% Descuento: ");
		lblNewLabel_6_2.setBounds(20, 310, 78, 14);
		contentPane.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Total Factura:");
		lblNewLabel_6_1_1.setBounds(20, 369, 78, 14);
		contentPane.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_7 = new JLabel("6600.00");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(94, 280, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		textField_4 = new JTextField();
		textField_4.setText("5%");
		textField_4.setBounds(94, 307, 46, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7_1 = new JLabel("1254.00");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7_1.setBounds(94, 339, 46, 14);
		contentPane.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("7500.00");
		lblNewLabel_7_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7_1_1.setBounds(94, 369, 46, 14);
		contentPane.add(lblNewLabel_7_1_1);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("Valor Descontado:");
		lblNewLabel_6_2_1.setBounds(175, 280, 103, 14);
		contentPane.add(lblNewLabel_6_2_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("330.00");
		lblNewLabel_7_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7_2.setBounds(281, 280, 46, 14);
		contentPane.add(lblNewLabel_7_2);
		
		JButton btnNewButton_3 = new JButton("Finalizar Factura ");
		btnNewButton_3.setBounds(281, 339, 121, 23);
		contentPane.add(btnNewButton_3);
		
		

	}
}


