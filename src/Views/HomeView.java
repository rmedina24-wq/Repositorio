package Views;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controllers.UsersController;

public class HomeView {
	private UsersController ctrluser;
	public HomeView() {
		// TODO Auto-generated constructor stub
	}

	public void home()
	{
		
		ctrluser= new UsersController();
		JFrame ventana = new JFrame();

		ventana.setSize(1000, 640);

		ventana.getContentPane().setBackground(Color.decode("#C8DEBD"));
		ventana.setLayout(null); 


		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255)); 
		panel.setLocation(0, 0);
		panel.setLayout(null);
		panel.setSize(1000, 600);  
		JButton goToUsers= new JButton("Ir al panel de usuarios");
		goToUsers.setBounds(100, 100, 200, 100);
		goToUsers.addActionListener(e->{
			ctrluser.showUsers();
		});

		ventana.add(panel);
		ventana.add(goToUsers);

		ventana.setVisible(true);
	}
}