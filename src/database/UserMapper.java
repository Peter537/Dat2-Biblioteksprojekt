package database;

import entities.Bruger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class UserMapper
{
    public static List<Bruger> getAllUsers() {

        System.out.println("hej");

        List<Bruger> userList = new LinkedList<>();

        Bruger user = null;
        PreparedStatement statement;
        try {
            Connection connection = ConnectionConfiguration.getConnection();
            {
                statement = connection.prepareStatement("SELECT * FROM Bibliotek.BrugerTabel");
            }


            ResultSet result = statement.executeQuery();

            while (result.next()) {

                int id = result.getInt("idBrugerTabel");
                String name = result.getString("navn");
                String address = result.getString("adresse");
                int postnr = result.getInt("postnr");

                user = new Bruger(id, name, address, postnr);

                System.out.println(user.toString());

                userList.add(user);


            }


        } catch (SQLException e) {
            System.out.println("kan ikke finde brugerne");
            //e.printStackTrace();
        }
        return userList;
    }
}