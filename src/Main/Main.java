package Main;

import controllers.UsersController;

public class Main {

    public static void main(String[] args) {

        UsersController controller = new UsersController();

        controller.showUsers();
    }
}