package mapper;

import database.ConnectionConfiguration;
import entities.Bruger;
import entities.Postnr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BrugerMapper {

    private static List<Bruger> brugerList = new ArrayList<>();

    protected static List<Bruger> getBrugerList() {
        if (!brugerList.isEmpty()) {
            return brugerList;
        }

        List<Bruger> tempBrugerList = new ArrayList<>();
        List<Postnr> postnrList = Facade.getPostnrList();
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

    protected static Bruger opretBruger(Bruger bruger) {
        try {
            Connection connection = ConnectionConfiguration.getConnection();
            String sql = "INSERT INTO bibliotek.bruger (navn, adresse, postnr) VALUES (?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, bruger.getNavn());
            statement.setString(2, bruger.getAdresse());
            statement.setInt(3, bruger.getPostnr().getPostnr());
            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();
            resultSet.next();
            bruger.setId(resultSet.getInt(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
        brugerList.add(bruger);
        return bruger;
    }
}