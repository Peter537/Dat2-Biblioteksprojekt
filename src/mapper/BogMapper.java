package mapper;

import database.ConnectionConfiguration;
import entities.Bog;
import entities.Forfatter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BogMapper {

    public static List<Bog> getBogList() {
        List<Bog> bogList = new ArrayList<>();
        List<Forfatter> forfatterList = getForfatterList();
        try {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM bibliotek.bog");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                int id = result.getInt("idbog");
                String titel = result.getString("titel");
                int forfatter = result.getInt("idforfatter");
                Forfatter forfatterObj = forfatterList.stream().filter(f -> f.getId() == forfatter).findFirst().orElse(null);
                bogList.add(new Bog(id, titel, forfatterObj));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bogList;
    }

    public static List<Forfatter> getForfatterList() {
        List<Forfatter> forfatterList = new ArrayList<>();
        try {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM bibliotek.forfatter");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                int id = result.getInt("idforfatter");
                String name = result.getString("name");
                forfatterList.add(new Forfatter(id, name));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return forfatterList;
    }
}