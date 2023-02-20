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

    public static List<Bruger> getBrugerList() {
        List<Bruger> brugerList = new ArrayList<>();
        List<Postnr> postnrList = getPostnrList();
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
                brugerList.add(new Bruger(id, navn, adresse, postnrObj));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return brugerList;
    }

    public static List<Postnr> getPostnrList() {
        List<Postnr> postnrList = new ArrayList<>();
        try {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM bibliotek.postnr");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                int postnr = result.getInt("postnr");
                String bynavn = result.getString("bynavn");
                postnrList.add(new Postnr(postnr, bynavn));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return postnrList;
    }
}