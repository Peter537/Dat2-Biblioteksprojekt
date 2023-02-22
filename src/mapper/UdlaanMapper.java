package mapper;

import database.ConnectionConfiguration;
import entities.Bog;
import entities.Bruger;
import entities.Udlaan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UdlaanMapper {

    private static List<Udlaan> udlaanList = new ArrayList<>();

    protected static List<Udlaan> getUdlaanList() {
        if (!udlaanList.isEmpty()) {
            return udlaanList;
        }

        List<Udlaan> tempUdlaanList = new ArrayList<>();
        List<Bruger> brugerList = Facade.getBrugerList();
        List<Bog> bogList = Facade.getBogList();
        try {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM bibliotek.udlaan");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                int id = result.getInt("idudlaan");
                int bruger = result.getInt("idbruger");
                int bog = result.getInt("idbog");
                Bruger brugerObj = brugerList.stream().filter(b -> b.getId() == bruger).findFirst().orElse(null);
                Bog bogObj = bogList.stream().filter(b -> b.getId() == bog).findFirst().orElse(null);
                tempUdlaanList.add(new Udlaan(id, brugerObj, bogObj));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        udlaanList = tempUdlaanList;
        return udlaanList;
    }

    protected static Udlaan opretUdlaan(Udlaan udlaan) {
        try {
            Connection connection = ConnectionConfiguration.getConnection();
            String sql = "INSERT INTO bibliotek.udlaan (idbruger, idbog) VALUES (?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, udlaan.getBruger().getId());
            statement.setInt(2, udlaan.getBog().getId());
            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();
            resultSet.next();
            udlaan.setId(resultSet.getInt(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return udlaan;
    }
}