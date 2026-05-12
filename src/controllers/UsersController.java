package controllers;

import java.util.ArrayList;

import models.User;
import models.UserDAO;
import Views.UsersView;

public class UsersController {

    public UsersView view;

    private UserDAO model;

    public UsersController() {

        view = new UsersView();

        model = new UserDAO();
    }

    public void showUsers() {

        ArrayList<User> users = model.obtenerUsuarios();

        view.tableUsers(users);

        view.setVisible(true);
    }
}
