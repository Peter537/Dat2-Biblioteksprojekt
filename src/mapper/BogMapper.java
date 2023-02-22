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

    private static List<Bog> bogList = new ArrayList<>();

    public static List<Bog> getBogList() {
        if (!bogList.isEmpty()) {
            return bogList;
        }

        List<Bog> tempBogList = new ArrayList<>();
        List<Forfatter> forfatterList = ForfatterMapper.getForfatterList();
        try {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM bibliotek.bog");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                int id = result.getInt("idbog");
                String titel = result.getString("titel");
                int forfatter = result.getInt("idforfatter");
                Forfatter forfatterObj = forfatterList.stream().filter(f -> f.getId() == forfatter).findFirst().orElse(null);
                tempBogList.add(new Bog(id, titel, forfatterObj));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        bogList = tempBogList;
        return bogList;
    }
}