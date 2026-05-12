package controllers;

import Views.RegisterView;
import view.AuthView;


public class AuthController {
    
    private AuthView vista;
    private RegisterView registro;
    
    public AuthController() {
        vista = new AuthView(this);
        registro = new RegisterView(this);
    }
    
    public void login() {
        vista.loginview();
    }
    
    public void register() {
        registro.registerView();
    }
}
