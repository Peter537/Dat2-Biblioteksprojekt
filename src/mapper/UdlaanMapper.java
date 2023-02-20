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

    public static List<Udlaan> getUdlaanList() {
        List<Udlaan> udlaanList = new ArrayList<>();
        List<Bruger> brugerList = BrugerMapper.getBrugerList();
        List<Bog> bogList = BogMapper.getBogList();
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
                udlaanList.add(new Udlaan(id, brugerObj, bogObj));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return udlaanList;
    }
}