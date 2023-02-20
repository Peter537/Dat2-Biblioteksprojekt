package mapper;

import database.ConnectionConfiguration;
import entities.Bruger;
import entities.Postnr;
import entities.Udlaan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BrugerMapper {

    public static List<Bruger> getBrugerList() {
        List<Bruger> brugerList = new ArrayList<>();
        try {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM bibliotek.bruger");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                int id = result.getInt("idbruger");
                String navn = result.getString("navn");
                String adresse = result.getString("adresse");
                int postnr = result.getInt("postnr");
                brugerList.add(new Bruger(id, navn, adresse, postnr));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return brugerList;
    }

    public static List<Postnr> getPostnrList() {
        return null;
    }
}