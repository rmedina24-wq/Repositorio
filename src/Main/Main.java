package Main;

import javax.swing.SwingUtilities;

import controllers.AuthController;


public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ventana miventana = new Ventana();
        //SwingUtilities.invokeLater(() -> new Ventana());
		//no funciono
		AuthController auth = new AuthController();
		auth.showLogin();
		

	}

}
