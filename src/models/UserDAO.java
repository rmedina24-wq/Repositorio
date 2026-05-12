package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDAO {

    public ArrayList<User> obtenerUsuarios() {

        ArrayList<User> listaUsuarios = new ArrayList<>();

        String query = "SELECT * FROM users";

        try {

            // Cargar driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Conexión con MySQL
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/roddd",
                    "root",
                    ""
            );

            // Preparar consulta
            PreparedStatement ps = conn.prepareStatement(query);

            // Ejecutar consulta
            ResultSet rs = ps.executeQuery();

            // Recorrer resultados
            while (rs.next()) {

                User user = new User();

                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setLast_name(rs.getString("lastname"));
                user.setEmail(rs.getString("email"));
                user.setPhone(rs.getString("phone"));

                listaUsuarios.add(user);
            }

            // Cerrar conexión
            rs.close();
            ps.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return listaUsuarios;
    }
}
