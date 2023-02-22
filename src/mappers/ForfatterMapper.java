package mappers;

import database.ConnectionConfiguration;
import entities.Forfatter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ForfatterMapper {

    private static List<Forfatter> forfatterList = new ArrayList<>();

    protected static List<Forfatter> getForfatterList() {
        if (!forfatterList.isEmpty()) {
            return forfatterList;
        }

        List<Forfatter> tempForfatterList = new ArrayList<>();
        try {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM bibliotek.forfatter");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                int id = result.getInt("idforfatter");
                String name = result.getString("navn");
                tempForfatterList.add(new Forfatter(id, name));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        forfatterList = tempForfatterList;
        return forfatterList;
    }

    protected static Forfatter opretForfatter(Forfatter forfatter) {
        try {
            Connection connection = ConnectionConfiguration.getConnection();
            String sql = "INSERT INTO bibliotek.forfatter (navn) VALUES (?)";
            PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setString(1, forfatter.getNavn());
            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();
            resultSet.next();
            forfatter.setId(resultSet.getInt(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
        forfatterList.add(forfatter);
        return forfatter;
    }
}