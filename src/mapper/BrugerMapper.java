package mapper;

import database.ConnectionConfiguration;
import entities.Bruger;
import entities.Postnr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BrugerMapper {

    private static List<Bruger> brugerList = new ArrayList<>();

    public static List<Bruger> getBrugerList() {
        if (!brugerList.isEmpty()) {
            return brugerList;
        }

        List<Bruger> tempBrugerList = new ArrayList<>();
        List<Postnr> postnrList = PostnrMapper.getPostnrList();
        try {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM bibliotek.bruger");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                int id = result.getInt("idbruger");
                String navn = result.getString("navn");
                String adresse = result.getString("adresse");
                int postnr = result.getInt("postnr");
                Postnr postnrObj = postnrList.stream().filter(p -> p.getPostnr() == postnr).findFirst().orElse(null);
                tempBrugerList.add(new Bruger(id, navn, adresse, postnrObj));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        brugerList = tempBrugerList;
        return brugerList;
    }
}